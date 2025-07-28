import java.util.Scanner;
//6. Sum of numbers from 1 to N
//Explanation: Add every i to sum variable.
//
//Input: 5
//
//Output: 15
public class Ques6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start = 1;
        int sum = 0;

        System.out.print("enter n :");
        int n = input.nextInt();

        while(start <= n){
            sum = sum + start;
            start++;
        }
        System.out.println(sum);
    }
}
