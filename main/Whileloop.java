package main;

import java.io.Console;

public class Whileloop {
    

public static void main(String[] args){

Console cons = System.console();

String input = "ABC";

while(input.length()>0){
    input = cons.readLine("Please enter atext. Balnk to end");
    if (input.length()>0){
        System.out.printf(">>> %s\n", input.toUpperCase());
    }
}
System.out.println("Bye bye");
}


}