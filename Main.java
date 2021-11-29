package com.company;

public class Main extends C201091_Car implements C201091_Recommend  {
    public static void main(String[] args) {
        C201091_Car item = new C201091_Car();
        item.setName("Lexus LS 560");
        System.out.println("The Car You want is"+' '+item.getName());
        C201091_Fullprice cost = new C201091_Fullprice();
        System.out.println("Name of the Model is " +item.carModel);
        System.out.println("Name of the Company is " +item.carCompany);
        System.out.println("Full Price of the Car is = "+cost.add(item.mainPrice(),item.megaOffer(),cost.tax)+" USD where "+cost.tax+" Tax is Added");
        C201091_Recommend rc = new Main();
        rc.RecommendCar();
    }
    @Override
    public void RecommendCar() {
        System.out.println("Some other model we may like is :");
        System.out.println("GT Mustang");
        System.out.println("Camaro");
        System.out.println("Supra");

    }
}
