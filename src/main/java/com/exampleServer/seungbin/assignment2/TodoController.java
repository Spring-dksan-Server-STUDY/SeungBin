package com.exampleServer.seungbin.assignment2;


import com.exampleServer.seungbin.Study2.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequestMapping("/todo")
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
    @GetMapping("")
    public List<MemoUser> getTodo() {
        return em.createQuery("select m from MemoUser m").getResultList();
    }

//    @PutMapping("/{id}")
//    @Transactional
//    public String putTodo();
//
//    }
//
    @DeleteMapping("/{id}")
    @Transactional
    public Long deleteTodo(@PathVariable Long id){
        em.createQuery("delete from MemoUser where id =: id")
                .setParameter("id", id)
                .executeUpdate();
        return id;
    }
}
