package DanishDynamite;

import java.util.Scanner;

public class Opgave4_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        int radius = input.nextInt();

        double α = Math.random() * 2 * Math.PI;
        double x = radius * Math.cos(α);
        double y = radius * Math.sin(α);

        System.out.println( x + "," + y);

         α = Math.random() * 2 * Math.PI;
         x = radius * Math.cos(α);
         y = radius * Math.sin(α);

        System.out.println( x + "," + y);

        α = Math.random() * 2 * Math.PI;
        x = radius * Math.cos(α);
        y = radius * Math.sin(α);

        System.out.println( x + "," + y);

        α = Math.random() * 2 * Math.PI;
        x = radius * Math.cos(α);
        y = radius * Math.sin(α);

        System.out.println( x + "," + y);

        α = Math.random() * 2 * Math.PI;
        x = radius * Math.cos(α);
        y = radius * Math.sin(α);

        System.out.println( x + "," + y);


    }
}
