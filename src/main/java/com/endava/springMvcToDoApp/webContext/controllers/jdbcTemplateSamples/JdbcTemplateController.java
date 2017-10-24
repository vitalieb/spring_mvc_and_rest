package com.endava.springMvcToDoApp.webContext.controllers.jdbcTemplateSamples;

import com.endava.springMvcToDoApp.rootContext.dao.RecordDao;
import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping(path = "/jdbc-template")
public class JdbcTemplateController {

    @Autowired
    RecordDao dao;

    @GetMapping(path = "/{id}")
    public String openAddRecord(@PathVariable Long id, Model model, UriComponentsBuilder uriBuilder) {
        RestTemplate template = new RestTemplate();
        URI uri = uriBuilder.path("/record/").path(id.toString()).build().toUri();
        Record entity = template.getForObject(uri, Record.class);
        model.addAttribute("record",entity);
        return "jdbc-template";
    }

}
