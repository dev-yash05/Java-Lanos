import java.util.Scanner;

//7. Sum of even numbers till N
//Explanation: Adds only if number is even.
//
//Input: 10
//
//Output: 30

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        int sum = 0;

        System.out.print("enter n :");
        int n = input.nextInt();

        while(start <= n){
            if (start % 2 == 0){
                sum = sum + start;
            }
            start++;
        }
        System.out.println(sum);
    }
}
