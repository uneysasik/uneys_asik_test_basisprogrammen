package be.intecbrussel;

import java.util.Scanner;

import static java.lang.System.out;

public class BasicProgrammingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You need to select 4 numbers. Please enter the first");
        int number1 = scan.nextInt();
        System.out.println("The second number please");
        int number2 = scan.nextInt();
        System.out.println("The third number please");
        int number3 = scan.nextInt();
        System.out.println("The forth number please");
        int number4 = scan.nextInt();
        System.out.println("You have selected your numbers. Now the transactions will be executed");

        int gemiddeld = (number1 + number2 + number3 + number4) / 4;

        System.out.println("Print het grootste getal: ");
        if (number1 >= number2 && number1 > number3 && number1 > number4) {
            System.out.println("Your biggest number is " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Your biggest number is " + number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("Your biggest number is " + number3);
        } else {
            System.out.println("Your biggest number is " + number4);
        }

        System.out.println("Print het kleinste getal: ");
        if (number1 <= number2 && number1 < number3 && number1 < number4) {
            System.out.println("Your smallest number is " + number1);
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println("Your smallest number is " + number2);
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println("Your smallest number is " + number3);
        } else {
            System.out.println("Your smallest number is " + number4);
        }


        System.out.println("Print alle getallen van het kleinste getal tot het gemiddelde van de 4 getallen: ");
        int i;
        if (number1 <= number2 && number1 < number3 && number1 < number4) {
            for (i = number1; i <= gemiddeld; i++) {
                System.out.print(i + " ");
            }
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            for (i = number2; i <= gemiddeld; i++) {
                System.out.print(i + " ");
            }
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            for (i = number3; i <= gemiddeld; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (i = number4; i <= gemiddeld; i++) {
                System.out.println(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Print alle getallen van 0 tot 2000 maar wanneer je een van de 4 getallen tegenkomt, stop de loop: ");
        int a;
        for (a = 0; a <= 2000; a++) {
            if (a == number1 || a == number2 || a == number3 || a == number4) break;
            out.print(a + " ");

        }
        System.out.println();
        System.out.println("Print Alle getallen van 0 tot 100, van groot naar klein en " +
                "klein naar groot in afwisselende volgorde:");


        for (int x = 0; x < 10; x++) {

            for (int y = 9; y > 0; y--) {
                System.out.print(x + "-" + y + " ");
            }
        }

    }
}


