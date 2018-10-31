package DanishDynamite;

import java.util.Scanner;

public class Opgave4_1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the center to vertex: ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin((Math.PI / 5));
        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));

        System.out.print("Enter area of the pentagon is: " + area);

    }
}
