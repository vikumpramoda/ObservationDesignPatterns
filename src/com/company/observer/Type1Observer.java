package com.company.observer;

public class Type1Observer implements Observer{

    @Override
    public void notifyObserver(String news){
        System.out.println("read the news:"+ news);
    }
}
