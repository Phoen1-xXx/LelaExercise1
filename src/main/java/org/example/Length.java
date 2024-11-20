package org.example;

public class Length {


    public static void main(String[] args) {

        //    Ex3
//    შექმენით Length კლასი და ამ კლასში შექმენით String ტიპის
//    სტრიქონი. თუ არსებული სტრიქონის სიგრძე არის ლუწი დაწერეთ
//    რომ ლუწია, თუ კენტია დაწერეთ რომ კენტია → (3 ქულა )
        String text = "QualityAssurance";

        if ((text.length()%2)== 0) System.out.println("სტრიქონის სიგრძე არის ლუწი რიცხვი");
        else if (text.length()%2==1) System.out.println("სტრიქონის სიგრძე არის კენტი რიცხვი");
        else System.out.println("სტრიქონის სიგრძე დაუდგენელია");

    }

}
Main