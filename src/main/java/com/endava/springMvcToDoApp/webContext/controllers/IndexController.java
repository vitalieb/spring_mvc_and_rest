package com.endava.springMvcToDoApp.webContext.controllers;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    RecordDao dao;

    @GetMapping
    public String listRecords(Model model) {
        List<Record> records = dao.findAll();
        model.addAttribute("allRecords", records);
        return "index";
    }

    @RequestMapping(method = POST)
    public String postNewRecord(Model model, @Valid Record record, BindingResult bindingResult) {
        model.addAttribute("record", record);
        if (!bindingResult.hasErrors()) {
            dao.saveAndFlush(record);
        }
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        dao.deleteById(id);
        return "redirect:/";
    }

}
