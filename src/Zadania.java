import javax.swing.*;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args){

        System.out.println("ZADANIE NR 1.");
        for(int i = 1; i <= 50; i++){
            System.out.print(i);
            if(i%3 == 0){
                System.out.print(" foo");
            }

            if(i%5 == 0){
                System.out.print(" bar");
            }

            if(i%7 == 0){
                System.out.print(" baz");
            }

            System.out.println();
        }

        System.out.println("ZADANIE NR 2.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wyraz: ");
        String wyraz = scan.nextLine();
        System.out.println("Kwestia: ");
        String kwestia = scan.nextLine();



    }

}
