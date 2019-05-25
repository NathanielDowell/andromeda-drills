import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {

        int i = 1;

        while (i < 15){
            System.out.println(i + "! And here it is again!! " + i);
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

        Scanner responseScanner = new Scanner(System.in);
        System.out.println("Hey pardner, I could really go for an integer right now: ");

        int n = responseScanner.nextInt();
        System.out.println("You chose " + n + ". Good choice.\n");
        System.out.println("-----Table of Powers----\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
            for (int f = 1; f<=n; f++) {
                int squared = f*f;
                int cubed = f*f*f;
                //printf allows use of
                System.out.printf("%-7d|%-9d|%-6d%n", f, squared, cubed);
            }

    }

}
