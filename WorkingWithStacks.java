package com.datastructures;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {

        //Vector class extends AbstractList<> and implements
        //List<> classes. Vector is synchronized.
        //it is recommended to use ArrayList<> if a thread-safe
        //implementation is not needed.
        //The Stack class represents last in first out
        //stack of objects
        //if we have pringles box the last one which
        //has been added to box is the first one which we are gonna eat
        //that's why it is called as last in first out (LIFO)
        //Stack extends Vector class with 5 operations
        //that allow a vector to be treated as Stack
        //usually it uses push and pop methods
        //push methods add element to stack
        //pop methods remove the last element from stack
        //peek method lets us to see which is the last element
        //without removing it but pop removes the last element
        //it has empty() method which is checking if stack is empty or not
        //and Search method which is searcing for element
        //stack slows down the operation because it is using
        //synchronized. we are mostly using it when
        //we are working in multi threaded environment
        //we have to be careful while deciding to use stack or not

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //we can use List interface like that as well
        //but here we can not use methods of Stack because
        //we are not using Stack interface: Stack<Integer>
        List<Integer> g = new Stack<>();
        g.add(121);
        System.out.println(g.remove(0));
        System.out.println(g);

        //it will show the last element in the Stack
        System.out.println(stack.peek());
        //it is gonna remove element at the top
        stack.pop();

        //we can show the last element by using
        // it is gonna remove the las element in the stack and
        //also display the element which is gonna be removed
        //System.out.println(stack.pop()) as well

        //it is gonna show the last element after calling pop()(removing element) method
        System.out.println(stack.peek());
        int a = stack.size();
        System.out.println(a);
        System.out.println(stack);

        //1st method of getting elements 1 by one without array brackets
        stack.forEach(System.out::println);

        //2nd method of getting elements 1 by one without array brackets
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i));
        }




    }
}
