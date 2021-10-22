package com.chelecious;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.print("Input A Positive Integers: ");
        int number=input.nextInt();
        theData(number);




        }
    public static void theData(int number){

        while (number>1){
            if (number%2==0) number/=2;
            else number=3*number+1;
            System.out.println("The Current Given Value is " +number+(number==1?"":" "));

        }

        System.out.println( );
    }

    }

