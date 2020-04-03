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
        System.out.printf("\n\n");
        System.out.println("ZADANIE NR 2.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wyraz: ");
        String wyraz = scan.nextLine();
        System.out.println("Kwestia: ");
        String kwestia = scan.nextLine();

        wyraz = wyraz.toLowerCase();
        kwestia = kwestia.toLowerCase();

        int i = 0;
        int prawda = 0;
        while(i < kwestia.length()){
            int j = 0;
            int z = 0;
            while(j < wyraz.length()){

                if (kwestia.charAt(i) == wyraz.charAt(z)){
                    prawda++;
                    z++;
                    i++;
                }

                j++;
            }
            if (prawda == wyraz.length()){
                System.out.println("true");
                break;
            }
            i++;
        }
        if (prawda != wyraz.length()){
            System.out.println("false");
        }
    }

}
