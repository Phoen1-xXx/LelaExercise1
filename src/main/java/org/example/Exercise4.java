package org.example;

public class Exercise4 {

    //    Ex4
//    Main კლასში შექმენით void -იანი მეთოდი სახელად
//    checkNumber, რომელიც პარამეტრად მიიღებს int ტიპის ცვლადს.
//    მეთოდმა დაბეჭდოს “დადებითი” თუ დადებით რიცხვს გადავცემთ,
//    დაბეჭდოს “უარყოფითი” თუ უარყოფით რიცხვს გადავცემთ და
//    დაბეჭდოს “ნოლი” თუ 0 -ს გადავცემთ → (3 ქულა )
    public static void main(String[] args) {
        checkNumber(0);
    }

    static void checkNumber(int number){
        if (number>0) System.out.println("დადებითი");
        else if (number<0) System.out.println("უარყოფითი");
        else System.out.println("ნული");
    }

}
