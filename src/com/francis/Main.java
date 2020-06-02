package com.francis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	printOut("Enter the number to convert to string\n");
	Scanner scanner = new Scanner(System.in);

	try{
	    int2str(Integer.parseInt(scanner.next()));
    }catch (NumberFormatException e){
	    printOut("The entered value is not an integer");
    }


    }

    static void int2str(int i){
        printOut(String.valueOf(i));
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
