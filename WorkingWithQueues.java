package com.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        //double LinkedList means there is a pointer to next element
        //and pointer to previous element as well
        //first element's previous one is gonna be null as it is first
        //and last element's next one is going to be null as it is the last node
        //Using LinkedList costs a lot as
        //when we are using double linkedList it is going to
        //take a lot of memory

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Albanda", 21));
        linkedList.add(new Person("Ali", 23));
        linkedList.add(linkedList.size()/2, new Person("camal", 33));
        linkedList.addLast(new Person("gulbeniz", 32));
        linkedList.addFirst(new Person("cavadxan", 15));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getFirst().name);

        //by using list iterator we can loop through our linkedlist
        //from back to front or from front to back
        ListIterator<Person> personListIterator = linkedList.listIterator();

        //hasNext() method is going to start from first object
        //and loop through until last object
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        //hasPrevious() method is going to start from last object in linkedlist
        //and loop through till the first one
        //like reversed
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        //it is using FIFO style
        //it means first in first out
        //for example in printer we are using this data structure
        //the first page we wanted to print is gonna be the first one
        //which is gonna be printed
        //Queue is interface which extends Collection class
        //it has own methods such as add(), offer(), remove(), poll(),
        //element(), peek() and methods from Collection as well

        //we can use offer() method instead of add()
        //when we are using capacity-restricted queue
        //if we use add() method instead of offer() in
        //capacity-restricted queues if there is no space for add()
        //it is gonna give us exception error
        //but in offer() it is gonna just return true or false
        //regarding if adding object to queue is successful or failed

        //if Queue is empty and we are trying to use remove() method
        //it is gonna throw exception. instead of it we can use poll() method
        // and it is gonna give us null if Queue is empty not exception.

        //we can use isEmpty() to check if Queue is empty or not

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Albanda", 24));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        //peek is showing first element in Queue
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());

        //poll methods retrieves and removes first element in queue
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
