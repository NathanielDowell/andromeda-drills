import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {

        int i = 5;

        while (i < 15){
            System.out.println(i + "!");
            i++;
        }

        System.out.println("BANANA!");

        long j = 2;
        do {

            System.out.println(j);
            j *= j;

        } while (j < 1000000); // I can't get the requisite result.  Adding a zero gives infinite zeros as a result.


        //Fizzbuzz!//

        int k = 1;

        for (k = 1; k <= 100; k++) {
            if (k % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (k % 5 == 0) {
                System.out.println("Buzz");
            } else if (k % 3 == 0) {
                System.out.println("Fiz");
            } else System.out.println(k);
        }

        System.out.println("BANANA");

//        Scanner responseScanner = new Scanner(System.in);
//
//        responseScanner.nextLine(System.in(String, "Hey pardner, I could really go for an integer right now: "));

    }

}
