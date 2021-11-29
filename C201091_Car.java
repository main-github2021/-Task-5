package com.company;

public class C201091_Car extends C201091_Price {
    @Override
    int mainPrice() {
        int price = 1000000;
        System.out.println("Full price is " +price);
        return price;
    }
    @Override
    int megaOffer() {
        int discount = 201091;
        System.out.println("Congratulation You are the lucky winner for Mega Offer");
        return discount;
    }



    private String carName;
    public String carModel;
    public String carCompany;
    C201091_Car()
    {
        carModel = "LS 560";
        carCompany = "Lexus";

    }

    public  String getName()
    {
        return carName;
    }
    public void setName(String name)
    {
        this.carName = name;
    }
}