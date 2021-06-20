package com.company.decorator;

public class BBQChickenPizza extends PizzaDecorator{
    BBQChickenPizza(Pizza p){
        this.pizza=p;
    }
    public double getCost(){
        return pizza.getCost()+400;
    }
}
