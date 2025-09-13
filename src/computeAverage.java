import java.util.Scanner;
public class computeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you use? ");
        double numbers = input.nextDouble();
        double total = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.print("Enter number: ");
            double number = input.nextDouble();
            total += number;
        }
        double average = total/numbers;
        System.out.printf("Average: %f",average);
    }
}
