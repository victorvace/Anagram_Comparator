package views;

import java.util.Scanner;

public class View {
    public String show(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a word to find it in the dictionary.");
        String word = sc.nextLine();
        sc.close();
        return word;
    }
}

//  Víctor Vanaclocha Cebrián