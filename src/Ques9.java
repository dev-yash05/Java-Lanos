import java.util.Scanner;

//9. Count number of digits
//Explanation: Divides number by 10 repeatedly.
//
//Input: 4567
//
//Output: 4
public class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digits Counter");
        System.out.print("Enter number: ");

        int number = input.nextInt();
        int count = 0;

        while (number != 0) {
            count = count + 1;
            number = number / 10;
        }

        System.out.println("Total no. of digits: " + count);
    }
}
