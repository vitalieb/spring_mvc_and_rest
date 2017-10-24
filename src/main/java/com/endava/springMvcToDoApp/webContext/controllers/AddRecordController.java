package com.endava.springMvcToDoApp.webContext.controllers;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/add-record")
public class AddRecordController {

    @Autowired
    RecordDao dao;

    @GetMapping
    public String openAddRecord(Model model) {
        model.addAttribute("record", new Record());
        return "add-record";
    }

    @PostMapping
    public String addRecord(Model model, @Valid Record record, BindingResult bindingResult) {
        model.addAttribute("record", record);
        if(!bindingResult.hasErrors()){
            dao.saveAndFlush(record);
        }
        return "add-record";
    }

}
