import java.util.Scanner;
//5. Print odd numbers from 1 to N
//Explanation: Only prints if i % 2 != 0.
//
//Input: 10
//
//Output: 1 3 5 7 9
public class Ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.print("enter n :");
        int n = input.nextInt();

        while(start <= n){
            if(start % 2 != 0){
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
