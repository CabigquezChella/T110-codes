package com.chelecious;

public class Main {

    public static void main(String[] args) {
        System.out.println("A spinning tire makes 3000 revolutions per minutes. " +
                "Calculate How many degrees it rotate in one second.\n");
         int numRev=3000,degree=360,seconds=60,sum=0;
         sum+=numRev*degree/seconds;
        System.out.println("The motor rotates " +sum+ " degrees in one second");

    }
}
