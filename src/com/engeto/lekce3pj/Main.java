package com.engeto.lekce3pj;

public class Main {

    public static void printFizzBuss () {
        String result;
        boolean isFizzOrBuzz;

        for (int i = 1; i <=100 ; i++) {
            isFizzOrBuzz=false;
            result="";

            if (i%3==0){
                isFizzOrBuzz=true;
                result="Fizz";
            }

            if (i%5==0){
                isFizzOrBuzz=true;
                result=result+"Buzz"; // is better result = result.concat("Buzz"); ?
            }

            if (isFizzOrBuzz==false){
                result = ""+i;  //how to convert i to string?
            }
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        printFizzBuss();
    }
}
