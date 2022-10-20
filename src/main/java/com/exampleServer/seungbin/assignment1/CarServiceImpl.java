package com.exampleServer.seungbin.assignment1;

public class CarServiceImpl implements CarInterface{

    @Override
    public void information(String CompanyName, String CarName) {
        System.out.println("차량 넘버: " + CompanyName + "차량 이름: " + CarName);
    }

    @Override
    public void getInfo(int CarNumber, String CarName) {
        CarInterface.super.getInfo(CarNumber, CarName);
    }

    public void getCar(){CarInterface.greetings();}
}
