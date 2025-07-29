import java.util.Scanner;

//11. Check if number is Armstrong
//Explanation: Sum of cube of digits = number.
//
//Input: 153
//
//Output: Armstrong Number

public class Ques11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("is the number Armstrong or not ");
        System.out.print("Enter number: ");

        int number = input.nextInt();
        int number2 = number;
        String numberStr = Integer.toString(number);
        int n = numberStr.length();

        int armstrongNumber = 0;


        while (number != 0) {
            int digit = number % 10;

            digit = (int) Math.pow(digit,n);

            armstrongNumber = armstrongNumber + digit ;
            number = number / 10;
        }


        if (number2 == armstrongNumber){
            System.out.println("The number " + number2 +" is Armstrong.");
        }else{
            System.out.println("The number " + number2 +" is not Armstrong.");
        }
    }
}
