package DanishDynamite;

import java.util.Scanner;

public class Opgave4_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int ascii = input.nextInt();
        System.out.println("The Character for ASCII code: " + (char)ascii);

    }
}
