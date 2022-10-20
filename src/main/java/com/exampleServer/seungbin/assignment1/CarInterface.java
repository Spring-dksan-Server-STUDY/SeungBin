package com.exampleServer.seungbin.assignment1;

public interface CarInterface {
    // 상수 필드
    String CarName = "현대자동차";

    //추상 메소드
    void information(String CompanyName, String CarName);

    //디폴트 메소드
    default void getInfo(int CarNumber, String CarName) {
        System.out.println("차량 넘버: " + CarNumber + "이고, 차량 이름은 " + CarName + "입니다.");
    }

    //정적 메소드
    static void greetings() {
        System.out.println("구매해주셔서 감사합니다 고객님");
    }
}
