package com.company.Utill;


import java.text.NumberFormat;

class CalcMethod {

    protected int specialnop(int numberOfPeople, int numberOfSpecialPeople){
        int specialnop = numberOfPeople - numberOfSpecialPeople;
        return specialnop;
    }

    protected  void share(int nopValue, int specialPValue, int specialItemValue, int amountSpentValue ){
        NumberFormat numF = NumberFormat.getNumberInstance();


        int specialShare = specialItemValue/specialnop(nopValue, specialPValue);
        int share = amountSpentValue/nopValue;
        int totalShare = share + specialShare;

        System.out.println("Everyone's Share is : " + numF.format(totalShare)+" Tooman");
        if (specialPValue != 0) {
            System.out.println("Special Share is: " + numF.format(share)+" Tooman");
        }

    }

    protected  void separateReturnShare(String name, int spentAmount, int nop){
        NumberFormat numF = NumberFormat.getNumberInstance();

        int returnShare = spentAmount/nop;
        int payback = spentAmount - returnShare;
        System.out.println(name+" Should receive : "+ numF.format(payback)+" Tooman");

    }

    protected void sIReturnShare (String name, int spentAmount, int specialnop, int nop){
        NumberFormat numF = NumberFormat.getNumberInstance();

        int returnShare = spentAmount/specialnop(nop, specialnop);
        int payBack = spentAmount - returnShare;
        System.out.println(name+" Should receive : "+ numF.format(payBack)+" Tooman"+", It's a little bit more because it's the special Item.");

    }

}
