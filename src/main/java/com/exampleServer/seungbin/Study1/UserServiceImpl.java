package com.exampleServer.seungbin.Study1;

public class UserServiceImpl implements Userinterface {

    @Override
    public void introduce(String name, String mbti) {
        System.out.println("추상 메소드");
        System.out.println("이름: " + name + "mbti: " + mbti);
    }


    @Override
    public void getInfo(int generation, String part) {
        Userinterface.super.getInfo(generation, part);
    }

    public void getSOPT() {
        Userinterface.introduceSOPT();
    }
}
