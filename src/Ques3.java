import java.util.Scanner;

//3. Print first N natural numbers
//Explanation: User provides N, loop prints 1 to N.
//
//Input: 5
//
//Output: 1 2 3 4 5
public class Ques3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.print("enter n :");
        int n = input.nextInt();

        while(start <= n){
            System.out.print(start + " ");
            start++;
        }
    }
}
