package DanishDynamite;

import java.util.Scanner;

public class Opgave4_22{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();

        if (s1.contains(s2)) {
            System.out.println(s1 + " contains " + s2);
        }else{
            System.out.println(s1 + " do not contains " + s2);
        }
    }
}
