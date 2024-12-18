import java.util.Scanner;
import java.util.Arrays;

public class SumSmallestLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter the first number:");
	int num1 = sc.nextInt();

	System.out.println("Enter the second number:");
	int num2 = sc.nextInt();

	System.out.println("Enter the third number:");
	int num3 = sc.nextInt();

	int[] numbers = {num1, num2, num3};

	Arrays.sort(numbers);

	int sum = numbers[0] + numbers[2];

	System.out.println("Sum of smallest and largest number: " + sum);

	sc.close();
    }
}
