package com.exampleServer.seungbin.assignment2;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class MemoUser {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;


    public MemoUser(final Long id, final String title, final String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

}
