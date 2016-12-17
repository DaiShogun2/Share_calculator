package com.company;

import com.company.Utill.CalcProcess;

public class Main {


    public static void main(String[] args) {
        CalcProcess calc = new CalcProcess();
        calc.calculate();
        exit(CalcProcess.getInput("Again? Y/N"));
    }


    public static void exit(String input){
        if(input.equalsIgnoreCase("Y")){
            main(null);
        }
    }
}
