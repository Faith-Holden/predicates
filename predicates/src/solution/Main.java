package solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        ArrayList<Integer> testList = new ArrayList<>();
        int counter = 0;
        while(counter<15){
            testList.add(counter+1);
            counter++;
        }

        List<Integer> newList = Predicates.collect(testList, e -> true);
        System.out.println(newList);
        System.out.println("Test Predicates.remove -> int > 8");
        Predicates.remove(newList, e -> e > 8);
        System.out.println(newList);
        System.out.println("________________________");

        newList = Predicates.collect(testList, e -> true);
        System.out.println(newList);
        System.out.println("Test Predicates.retain -> int > 8");
        Predicates.retain(newList, e -> e > 8);
        System.out.println(newList);
        System.out.println("________________________");

        newList = Predicates.collect(testList, e -> true);
        System.out.println(newList);
        System.out.println("Test Predicates.collect -> int > 8");
        newList  = Predicates.collect(testList, e -> e > 8);
        System.out.println(newList);
        System.out.println("________________________");

        newList = Predicates.collect(testList, e -> true);
        System.out.println(newList);
        System.out.println("Test Predicates.find -> location of 8");
        int newInt = Predicates.find(testList, e -> {
            return e.equals(8);
        });
        System.out.println("Location " + newInt);
        System.out.println("________________________");

    }
}
