package org.example;

public class While {

//    Ex2
//    შექმნით ახალი კლასი სახელად While და while ციკლით
//    დაბეჭდეთ String -ში არსებული ყოველი მესამე სიმბოლო,
//    ანუ 3 პოზიციაზე მდგომი, შემდეგ 6 მდგომი, შემდეგ 9
//    მდგომი … თუ რომელიმე მესამე სიმბოლო იქნება პატარა z ასო,
//    მაშინ ციკლი შეწყდეს → (3 ქულა )
    public static void main(String[] args) {

        String name = "Aleksazdre";

        int i=0;
        while(i<name.length() && name.charAt(i)!='z'){
            i = i +3;
        }
        System.out.println("name.charAt(" + i + ") - არის 'z'." );
    }
}




