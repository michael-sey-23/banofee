import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Enter radius: ");
        double radius = getInput.nextDouble();

        double area = Math.pow(radius, 2) * PI;
        System.out.printf("Area of circle is %f",area);

        getInput.close();
    }
}
