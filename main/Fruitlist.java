package main;

//importing the collection framework
import java.util.*;

public class Fruitlist {


    public static void main(String[] args){


        // creating a list called listoffruits
        List<String> listoffruits = new ArrayList<String>();


        //manually adding items to listoffruits
        listoffruits.add("Apple");

        listoffruits.add("Orange");

        listoffruits.add("Pear");

        listoffruits.add("Grapes");

        listoffruits.add("Guava");

        
        //getting the output of the fruits in the list
        System.out.println(listoffruits);

        //removing a fruit with the index 2, should be Pear
        listoffruits.remove(2);


        //removing Apple from the list of fruits
        listoffruits.remove("Apple");


        // getting the output of the list of fruits after removing the 2 items above
        System.out.println(listoffruits);

    }
    
}
