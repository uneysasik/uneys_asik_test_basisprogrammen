package be.intecbrussel;

import java.util.Scanner;

import static java.lang.System.out;

public class BasicProgrammingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        out.println("You need to select 4 numbers. Please enter the first");
        int number1 = scan.nextInt();
        out.println("The second number please");
        int number2 = scan.nextInt();
        out.println("The third number please");
        int number3 = scan.nextInt();
        out.println("The forth number please");
        int number4 = scan.nextInt();
        out.println("You have selected the best. Now your transactions will be executed");

        if (number1 >= number2 && number1 > number3 && number1 > number4) {
            out.println("Your biggest number is " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            out.println("Your biggest number is " + number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            out.println("Your biggest number is " + number3);
        } else {
            out.println("Your biggest number is " + number4);
        }

        if (number1 <= number2 && number1 < number3 && number1 < number4) {
            out.println("Your smallest number is " + number1);
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            out.println("Your smallest number is " + number2);
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            out.println("Your smallest number is " + number3);
        } else {
            out.println("Your smallest number is " + number4);
        }

        int gemiddeld = (number1 + number2 + number3 + number4) / 4;


        out.println("Alle getallen van het kleinste getal tot gemiddelde getal:");
        int i;
        if (number1 <= number2 && number1 < number3 && number1 < number4) {
            for (i = number1; i <= gemiddeld; i++) {
                out.print(i + " ");
            }
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            for (i = number2; i <= gemiddeld; i++) {
                out.print(i + " ");
            }
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            for (i = number3; i <= gemiddeld; i++) {
                out.print(i + " ");
            }
        } else {
            for (i = number4; i <= gemiddeld; i++) {
                out.println(i + " ");
            }
        }
        out.println(" ");
        out.println("Nummer van 0 tot jouw nummer getoont als: ");
        int a;
        for (a = 0; a <= 2000; a++) {
            if (a == number1 || a == number2 || a == number3 || a == number4) break;
            out.print(a + " ");

        }
        out.println();
        out.println("Print Alle getallen van 0 tot 100, van groot naar klein en " +
                "klein naar groot in afwisselende volgorde:");

        int x;
        int y;
        for (x=100;x>=0;x--) {break;}
            for (y=0;y<100;y++);{
            System.out.println(x+y);
        }

    }
}
