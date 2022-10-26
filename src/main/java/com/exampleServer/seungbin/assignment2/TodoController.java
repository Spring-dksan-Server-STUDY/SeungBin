package com.exampleServer.seungbin.assignment2;


import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "/todo")
@RequiredArgsConstructor
public class TodoController {

    private final EntityManager em;

    @PostMapping()
    @Transactional
    public Long postTodo(@RequestBody final MemoUser memoUser){
        System.out.println("memoUser: " + memoUser);
        em.persist(memoUser);
        return memoUser.getId();
    }

//    @GetMapping("/{id}")
//    @Transactional
//    public Long getTodo() {
//
//    }

//    @PutMapping("/{id}")
//    @Transactional
//    public String putTodo();
//
//    }
//
//    @DeleteMapping("/{id}")
//    @Transactional
//    public String deleteTodo(){
//
//    }
}
