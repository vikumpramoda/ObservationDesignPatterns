package com.company.observer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{


       // Main main = new Main();
       // main.readFile("news.txt");



        //publisher-> Subject
        //subscriber -> observer
        //type of observers -> NewsReader,FoodWrapper

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3= new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("curfew will be imposed today");

        Thread.sleep(10000);
        System.out.println("=====================");

        subject.notifyObservers("Reversed: curfew will not be imposed today");

        Thread.sleep(5000);
        subject.unsubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("=======================");
        subject.notifyObservers("Fuel price gone up!");
    }

    public void readFile(String fileName){
        File file = new File(getClass().getResource(fileName).getPath());
        try{
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
