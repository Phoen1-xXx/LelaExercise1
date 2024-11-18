package org.example;

public class Main {

//    Ex1
//    Main კლასის main მეთოდში შექმენით მასივი რიცხვითი
//    მნიშვნელობებით და თუ ამ მასივში არ არის ლუწი რიცხვი,
//    მაშინ დაიბეჭდოს “მასივში არ არის ლუწი რიცხვი ”. თუ ამ
//    მასივში არის ლუწი რიცხვი (მაგალითად 5 ლუწი რიცხვია)
//    მაშინ დაბეჭდოს “ამ მასივში არის 5 ლუწი რიცხვი ” → (3
//    ქულა )
    public static void main(String[] args) {

        int[] intArray = {5,3,4,10,6,32};
        int oddNumQuantity = 0;

        for (int i = 0; i<intArray.length; i++){
            if (intArray[i]%2==0){
                oddNumQuantity++;
            }
        }

        if (oddNumQuantity==0) System.out.println("ამ მასივში არის " + oddNumQuantity + " ლუწი რიცხვი");
        else System.out.println("ამ მასივში არ არის ლუწი რიცხვი");

    }

}