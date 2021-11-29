package com.company;
import org.w3c.dom.ls.LSOutput;

public class C201091_Fullprice extends C201091_Car
{
    public double tax = super.mainPrice()*2.0/100.0;
    public int add(int x,int y,int z)
    {
        return x+z-y;
    }
    public double add(int x,int y,double z)
    {
        return x+z-y;
    }
}