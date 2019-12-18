package com.company;


public class Main {

    private static Number addition;

    public static void main(String[] args) {
Compilator<Integer> i=new Compilator<>(23);
Compilator<Double> d= new Compilator<>(25.4);
        System.out.println("Sum of numbers "+  addition(i,d));

    }
  public static Number  addition(Compilator<? extends Number> i, Compilator<? extends Number> f){
return i.getNumber().doubleValue()+f.getNumber().doubleValue();}
}
