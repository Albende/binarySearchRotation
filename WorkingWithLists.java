package com.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //we can add any element or object to List if we use
//        List colors = new ArrayList();
//        colors.add("blue");
//        colors.add("purple");
//        colors.add(1);
//        colors.add(new Object());
        //List without specifying its type
        //to Specify its type we have to use
        // List<type> = new ArrayList<>();
        //this type can be whatever we can have
        //for example String or int or boolean and so on

        //List.of() method is immutable
        //it means that we can not change its elements
        //by using .add method.
        //it is gonna give us UnsupportedOperationException
        //because we are trying to modify immutable list by using add method
        //and it is not possible to do it
        List<String> colorsUnmodifiable= List.of(
                "green",
                "pink",
                "cara"
        );
        //it can not work because List.of() method is immutable
        // to be specific .of() method itself is immutable but
        //we are trying to treat with it as mutable
        //that's why we are gonna get error which I mentioned above
        //colorsUnmodifiable.add("gece");

        //it gives array
        System.out.println(colorsUnmodifiable);

        //1st method of displaying all elements
        for (int i=0; i< colorsUnmodifiable.size();i++){
            System.out.println(colorsUnmodifiable.get(i));
        }

        //second method of displaying elements
        colorsUnmodifiable.stream().forEach(System.out::println);

        //or we can use it withouth .stream() as well
        //in Lists it is possible to do it
        colorsUnmodifiable.forEach(System.out::println);



        //3rd method of displaying elements of arrays
        for(String color: colorsUnmodifiable){
            System.out.println(color);
        }


        List<String> colors = new ArrayList<>();

        //we can use ArrayList like that as well
        //ArrayList<String> colors = new ArrayList<>();
        //but we are not using it because
        //when we use List<> we can use it as
        //new ArrayList<>() or other lists as well
        //for example new LinkedList<>();
        //List<String> colors = new LinkedList<>();


        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        //giving the size of List it is the same as length method in Array
        System.out.println(colors.size());
        //boolean check
        System.out.println(colors.contains("yellow"));
        //boolean check
        System.out.println(colors.contains("pink"));
        System.out.println(colors);
        for (String color: colors){
            System.out.println(color);
        }
        //here we do not have to say stream
        //we can use it but not needed
        colors.forEach(System.out::println);

        for(int i=0; i<colors.size(); i++){
            //we are using .get method with nested for loop to get all elemetns of our list
            System.out.println(colors.get(i));
        }


    }
}
