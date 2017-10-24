package com.endava.springMvcToDoApp.webContext.controllers.rest;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/read-all-rest-controller")
public class ReadAllRecordsOtherAnnotationsController {

    @Autowired
    RecordDao dao;

    @GetMapping(produces = "application/json")
    public List<Record> allRecordsUsingOtherAnnotations(){
        return dao.findAll();
    }

}
