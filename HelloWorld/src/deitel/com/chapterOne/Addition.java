package deitel.com.chapterOne;

import java.util.Scanner; //program uses class scanner

public class Addition {

    //main method begins execution of Java Application
    public static void main(String[] args)
    {
        //create scnnaer to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; //first number to add
        int number2; //decond number to add
        int sum; //sum of number1 and number2

        System.out.print("Enter First integer: "); //promt
        number1 = input.nextInt(); //read first number from user

        System.out.print("Enter second integer: "); //promt
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; //add numbers, then store total in sum

        System.out.printf("Sum is %d%n", sum); //display sum
    }

}
