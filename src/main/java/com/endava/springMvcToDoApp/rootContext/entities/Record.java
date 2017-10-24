package com.endava.springMvcToDoApp.rootContext.entities;

import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Component
@Table(name = "records")
@Proxy(lazy = false)
public class Record {

    public Record() {
    }

    public Record(String contents) {
        this.contents = contents;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
//    @Size(min = 4)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
