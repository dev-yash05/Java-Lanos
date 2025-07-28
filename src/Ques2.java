//2. Print numbers from 10 to 1
//Explanation: Decrementing counter from 10 to 1.
//
//Input: None
//
//Output: 10 9 8 7 6 5 4 3 2 1
public class Ques2 {
    public static void main(String[] args) {
        int number = 10;
        while(number >= 1) {
            System.out.print(number + " ");
            number--;
        }
    }
}
