package com.sahabt;

public class calculator {

    public void toplama(int value1,int value2){
        int result;
        result = value1 + value2;
        System.out.println(result);

    }

    public void cikartma(int value1,int value2){
        int result;
        result = value1 - value2;
        System.out.println(result);

    }

    public void carpma(int value1,int value2){
        int result;
        result = value1 * value2;
        System.out.println(result);

    }
    public void bolme(double value1,double value2){
        double result;
        result = value1 / value2;
        System.out.println(result);



    }

    public static void main( String[] args )
    {
        calculator cal = new calculator();
        cal.toplama(3,4);
        cal.cikartma(5,6);
        cal.bolme(15,2);
        cal.carpma(23,5);









    }


}
