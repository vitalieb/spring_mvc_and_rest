package com.endava.springMvcToDoApp.webContext.controllers.rest;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
@Controller
@RequestMapping(consumes = "application/json")
public class CreateNewRecordController {

    @Autowired
    RecordDao dao;

    @PostMapping(path = "/add")
    public ResponseEntity createRecord(@RequestBody Record record,
                                       UriComponentsBuilder uriComponentsBuilder // used for dynamically building URIs
    ) {
        dao.save(record);
        HttpHeaders headers = new HttpHeaders();

        //Building URI dynamically
        URI uri = uriComponentsBuilder.path("/record/").path(record.getId().toString()).build().toUri();
        headers.setLocation(uri);
        return new ResponseEntity(record, headers, HttpStatus.CREATED);
    }
}
