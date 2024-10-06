import java.util.Scanner;

public class EuclidAlgorithm{
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = inputDevice.nextInt();
        System.out.print("Enter the second number: ");
        int y = inputDevice.nextInt();
        while (y != 0) {
            int m = x % y;
            x = y;
            y = m;
        }
        System.out.print("The Greatest Common Divisor (gcd) is: " + x);
    }
}