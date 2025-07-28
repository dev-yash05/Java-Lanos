import java.util.Scanner;
//4. Print even numbers from 1 to N
//Explanation: Skips odd numbers by incrementing by 2 if even, or conditionally checking.
//
//Input: 10
//
//Output: 2 4 6 8 10
public class Ques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.print("enter n :");
        int n = input.nextInt();

        while(start <= n){
            if(start % 2 == 0){
            System.out.print(start + " ");
            }
            start++;
        }
    }
}
