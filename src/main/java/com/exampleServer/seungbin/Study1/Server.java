package com.exampleServer.seungbin.Study1;

public class Server extends Part {

    private String language;

    @Override
    public void test() {
        super.test();
        System.out.println("자식 클래스입니다");
    }

    public Server(String name, String study) {
        super(name);
        this.language = study;
    }

    public String getStudy() {
        return language;
    }

    public void setStudy(String study) {
        this.language = language;
    }

    public Server(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}