import java.util.Scanner;
//10. Check if a number is palindrome
//Explanation: Compares reversed number with original.
//
//Input: 121
//
//Output: Palindrome
public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = input.nextInt();
        int number2 = number;

        int reversed = 0;
        boolean isPalindrome;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        isPalindrome = number2 == reversed;


        if(isPalindrome){
            System.out.println("The number "+ number2 + " is a palindrome.");
        }else{
            System.out.println("The number "+ number2 + " is not a palindrome.");
        }


    }
}
