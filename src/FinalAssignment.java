import java.util.Scanner;

public class FinalAssignment {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Here we declare the array for the scores and its length. We also create a "counter" for the loop and switch.
        int[] scores = new int[7];
        int i = 0;

        // We create a while-loop with the condition i<7 since the index goes from 0-6.
        while (i < 7) {

            //We create a do-while-loop that keeps on executing the switch for the same index while the input value is
            // negative or above 100. When the value input is 0-100 the switch register that value for that index and moves to the next index.
            do {
                switch (i) {
                    case 0 -> System.out.println("Enter the score for the 1st student: ");
                    case 1 -> System.out.println("Enter the score for the 2nd student: ");
                    case 2 -> System.out.println("Enter the score for the 3rd student: ");
                    case 3, 4, 5, 6 -> System.out.printf("Enter the score for the %dth student: ", (i + 1));

                }
                // We also create an if-statement that executes while the input value is negative or above 100.
                scores[i] = input.nextInt();
                input.nextLine();
                if (scores[i] < 0 || scores[i] > 100) {
                    System.out.println("Error - Input out of bound. Score can only be between 0 and 100.");
                }

            } while (scores[i] < 0 || scores[i] > 100);
            i = i + 1;

        }
        System.out.println("Thank you for your input");
    }
}
