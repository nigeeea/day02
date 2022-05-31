package main;

public class Main {
    

public static void main(String[] args){

    String[] todos = new String [5];


    todos[0] = "learn Java";
    todos[1] = "go jogging";
    todos[2] = "watch a movie";

    System.out.printf("Index: %d: value =%s\n,", 0, todos[0]);
    System.out.printf("Index: %d: value =%s\n,", 0, todos[1]);
    System.out.printf("Index: %d: value =%s\n,", 0, todos[2]);
    System.out.printf("Index: %d: value =%s\n,", 0, todos[3]);

    System.out.printf("Size of array: %d\n", todos.length);

    //Size of args
    System.out.printf("Size of args: %d\n", args.length);
    System.out.printf("Index: %d: value =%s\n,", 0, args[3]);

}

}