import java.util.Scanner;

//12. Factorial of a number
//Explanation: Multiply 1×2×...×N
//
//Input: 5
//
//Output: 120
public class Ques12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get its Factorial (!n) :");
        int number = input.nextInt();
        int i = 1;
        int factorial = 1;
        while(i <= number){
            factorial = factorial * (i);
            i++;
        }
        System.out.println("Factorial of "+ number +" is: "+ factorial);
    }
}
