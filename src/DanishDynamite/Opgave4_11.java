package DanishDynamite;

import java.util.Scanner;

public class Opgave4_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hex = input.nextInt();

        if (hex <= 9) {
            System.out.println("The hex value is: " + hex);

        }
        else {
            System.out.println("The hex value is: " + (char)(hex+55));
        }
    }
}
