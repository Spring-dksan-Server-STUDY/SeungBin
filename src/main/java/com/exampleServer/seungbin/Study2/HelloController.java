package com.exampleServer.seungbin.Study2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "")
public class HelloController {

    @GetMapping()
    public String Hello(){
        return "Hello world";
    }

    @GetMapping("/hello")
    public String Hello2(){
        return "Hello world2";
    }
    @GetMapping("name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @GetMapping("/sopt")
    public String getPart(
            @RequestParam(value = "part", defaultValue = "") final String part,
            @RequestParam(value = "type", defaultValue = "") final String type
    ){
        return "파트는 " + part + "이고, " + type + "입니다.";
    }

    @PostMapping("/member")
    public String postMember(@RequestBody final Member member){
        return member.getName();
    }

    @PutMapping("/member")
    public String putMember(@RequestBody final Member member) {
        return member.getName();
    }

    @DeleteMapping("/member")
    public String deleteMember(@RequestBody final Member member) {
        return "delete success";
    }

}
