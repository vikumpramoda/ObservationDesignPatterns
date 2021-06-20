package com.company.decorator;

public class TandooriChickenPizza extends PizzaDecorator{
    TandooriChickenPizza(Pizza p){
        this.pizza=p;
    }

    public double getCost(){
        return pizza.getCost()+400;
    }

}
