package com.company.decorator;

public class Main {

    public static void main(String[] args){
        Pizza pizza=new ThinCrustPizza();
        Pizza bbqChickenPizza=new BBQChickenPizza(pizza);
        Pizza bbqChickenPizzaWithExtraChicken =new ExtraCheese(bbqChickenPizza);
        System.out.println("Cost of BBq Chicken with extra cheese: "+bbqChickenPizzaWithExtraChicken.getCost());

        Pizza panPizza=new PanPizza();
        Pizza tandooriChickenPizza=new TandooriChickenPizza(panPizza);
        System.out.println("Cost of Tandoori Chicken with extra cheese: "+tandooriChickenPizza.getCost());

    }
}
