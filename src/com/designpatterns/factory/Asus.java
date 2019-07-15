package com.designpatterns.factory;

public class Asus implements Computer {

    @Override
    public void name() {
        System.out.println("Bilgisayar�n Markas� Asus");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " senesinde al�nm��.");
    }
}