package org.example;

//    Ex5
//    Main კლასსი შექმენით void -იანი მეთოდი სახელად hasTeen,
//    რომელიც პარამეტრად მიიღებს სამ ცალ int ტიპის ცვლადს.
//    მეთოდმა დაბეჭდოს “True” თუ რომელიმე პარამეტრი მაინც იქნება
//    მინიმუმ 13 და მაქსიმუმ 19. მეთოდმა დაბეჭდოს “False” თუ
//    არც ერთი პარამეტრი არ იქნება 13 - 19 დიაპაზონში → (3 ქულა )
public class Exercise5 {

    public static void main(String[] args) {
        hasTeen(12,195,154);
    }


    static void hasTeen(int first, int second, int third){
        if ((12<first && first<20) || (12<second && second<20) || (12<third && third<20) ){
            System.out.println("True");
        }else System.out.println("False");
    }

}
