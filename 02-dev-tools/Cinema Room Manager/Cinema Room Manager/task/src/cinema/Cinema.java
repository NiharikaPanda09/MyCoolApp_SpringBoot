package cinema;
import java.util.*;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        System.out.print(" ");
        for(int i =1;i<=8;i++){
           
                System.out.print(i + " ");
            }
            System.out.println(" ");

         for (int row = 1; row <= 7; row++) {
            System.out.print(row + " ");
            for (int seat = 1; seat <= 8; seat++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }
}