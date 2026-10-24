import java.lang.System;
import java.util.Scanner;

class Hello {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine();   // Consume the leftover newline
        String department = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Department: " + department);

        scan.close();
    }
}