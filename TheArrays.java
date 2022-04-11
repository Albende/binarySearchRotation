package com.datastructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        //we have to specify the number of arrays new String [n]
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";


        //We can not get our Array by calling colors like that in inside of brackets
        //if we specify colors[0] we will get purple but we can not get it by calling only colors
        //instead we have to use Arrays.toString method to get our array correctly.
        //System.out.println(colors);

        System.out.println(Arrays.toString(colors));

        //if we try to call colors[5] it will give us error
        //System.out.println(colors[5]);
        //and error is gonna be index out of bound as we do not have 6th element in our array
        //whichs' index is equal to 5

        //if we know the number of elements which is our array gonna have
        //we can define it in faster way like that

        int[] numbers = {100, 200};
        //System.out.println(numbers[0]);

        //we can get all elements by using for loop like that
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        //or
        //we are using colors.length-1 because colors.length is 5 and if it is 5
        //we are gonna get index out of bound error if we use it without -1.
        for (int i=colors.length-1; i>=0;i--){
            System.out.println(colors[i]);
        }

        //or we can use enhanced for loop
        for(String color: colors){
            System.out.println(color);
        }

        //and the best way of doing it is by using Stream
        Arrays.stream(colors).forEach(System.out::println);

    }
}
