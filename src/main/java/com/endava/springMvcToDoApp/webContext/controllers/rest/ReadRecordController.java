package com.endava.springMvcToDoApp.webContext.controllers.rest;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@RestController
public class ReadRecordController {

    @Autowired
    RecordDao dao;

    @GetMapping(value = "/record/{id}", produces = "application/json")
    public ResponseEntity<Record> getRecord(@PathVariable(name = "id") long id) {
        Record record = dao.getOne(id); //Throws: javax.persistence.EntityNotFoundException - if no entity exists for given id.
        return new ResponseEntity<Record>(record, HttpStatus.OK);
        // actually we can use @ResponseBody and not specify a status
        // by the time we handle the exceptions
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<EntityNotFoundException> recordNotFound(EntityNotFoundException e) {
        return new ResponseEntity(new Error(e.getMessage()), HttpStatus.NOT_FOUND);
        // alternatively we may return a @ResponseBody and
        // set a @ResponseStatus(HttpStatus.NOT_FOUND) on method
    }
}
