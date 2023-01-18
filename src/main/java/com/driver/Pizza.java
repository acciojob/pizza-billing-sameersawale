package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

    }

    public int getPrice(){
        if(isVeg){
            return this.price=300;
        }
        else
            return this.price=400;

    }

    public void addExtraCheese(){
        price=price+80;
        return;
    }

    public void addExtraToppings(){
       if(isVeg){
           price=price+70;
       }
       else
           price=price+120;
       return;
    }

    public void addTakeaway(){
        price=price+20;
        return;
    }



    public String getBill(){
        bill=String.valueOf(price);
        return this.bill;
    }
}
