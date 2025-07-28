import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
     int number, startingPoint, endingPoint, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication Table");
        System.out.print("Enter the Number for Multiplication Table: ");
        number = input.nextInt();
        System.out.print("Enter the Starting point: ");
        startingPoint = input.nextInt();
        System.out.print("Enter the Ending Point: ");
        endingPoint = input.nextInt();

     while (startingPoint <= endingPoint){
         result = number * startingPoint;
         System.out.println(number + " X " + startingPoint + " = " + result);
         startingPoint++;
     }
    }
}
