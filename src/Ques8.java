import java.util.Scanner;

//8. Reverse a number
//Explanation: Uses modulus and division to extract digits.
//
//Input: 1234
//
//Output: 4321
public class Ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = input.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
