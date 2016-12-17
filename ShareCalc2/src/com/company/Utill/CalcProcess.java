package com.company.Utill;

import java.util.Scanner;

public class CalcProcess {

    public  void calculate(){

        int amountSpent = getInputNum("How Much Was the Total Cost Excluding the Special Item?");

        int specialItem = getInputNum("How Much Was the Special Item?");

        int nop = getInputNum("How Many People Were Involved?");

        int specialP = getInputNum("How Many People Were Vegans?");

        CalcMethod calcm = new CalcMethod();
        calcm.share(nop, specialP, specialItem, amountSpent);

        //to calculate the amount we should give back to people


        String input = getInput("\n\nDid Different people pay for different things?\nType Yes or No: " );

        if (input.equalsIgnoreCase("yes")) {

            int input2Value = getInputNum("How Many People?");
            try {
                for (byte i = 0 ; i < input2Value; i++) {

                    String personName = getInput("What is his/her name?");
                    int personSpent = getInputNum("How Much did he/she spent?");


                    if(personSpent == specialItem){
                        String sIConf = getInput("Was This The Special Item?\nYes or No: ");
                        if (sIConf.equalsIgnoreCase("yes")){
                            calcm.sIReturnShare(personName, personSpent, specialP,nop);
                        } else {
                            break;
                        }

                    }   else {
                        calcm.separateReturnShare(personName,personSpent,nop);
                    }

                }
            } finally {
                System.out.println("Thank You For Using My First App!\nHave Good Day!\nEnjoy!");
            }

        } else {
            System.out.println("Thank You For Using My First App!\nHave Good Day!\nEnjoy!");
        }

    }
    public static String  getInput(String msg){

        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        
        return scanner.nextLine();

    }
    public static int  getInputNum(String msg){

        boolean okay;

        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextDouble()) {
                break;
            }
            String word = scanner.next();
            System.err.println(word + " is not a number!");
        }
        return scanner.nextInt();

    }

}
