package com.endava.springMvcToDoApp.webContext.controllers.rest;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ReadAllRecordsXMLController {

    @Autowired
    RecordDao dao;

    @GetMapping(path="/read-all-records", produces = "application/xml")
    public @ResponseBody List<Record> allRecords(){
        return dao.findAll();
    }

}
