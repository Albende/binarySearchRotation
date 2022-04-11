package com.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMap {

    //we could basically use Maps to
    //solve the majority of coding challenges
    //there are a lot of types of maps
    //mostly used one is HashMap<>
    //Map itself is interface and it has couple
    //of implementations
    //for example HashTable - null not allowed and synced
    //HashMap - null allowed it is not synced
    //LinkedHashMap - null allowed it is working doubly linkedList based and it is slow
    //we have SortedMap<> NavigableMap<> TreeMap<> nulls are not allowed on them and they are sorted

    //Map is a collection of key value pairs
    // it is like Map<key,value>
    //key can not be duplicate
    //we can assign at most 1 value to each key
    //an object is key-value pair in java as in javascript

    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();

        //now here Person is the key and Diamond is value
        map.put(new Person("Jamilla"), new Diamond("African Diamond"));
        System.out.println(map);
        //if we try to get the value by using it without overriden
        // hashCode like that
        //we will get only null when we will try to get value
        // by using map.get(new Person(key));because when we say new
        //it is going to generate new hashcode for it and
        //it will not give us value
        //System.out.println(map.get(new Person("Jamilla")));

        //but after overriding hashCode() method in our Person class
        //we will be able to get it because overriden hashCode is gonna
        //be assigned to the value which was assigned to the same key before
        //because of that it does not matter how many times we will call
        //Person class with the same key, we will get always the same result
        //because of overriding
        //actually if we are using record we do not need to do it but
        //by static classes we are needed to override hashcode method
        //as well as toString and also we have to have constructor for sure
        //p.s. if we override hashCode it is gonna override equal method as well
        //by default
        System.out.println(map.get(new Person("Jamilla")));
        System.out.println(map.get(new Person("Jamilla")).name);
        String a = map.get(new Person("Jamilla")).name;
        for (int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }

    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ali"));
        map.put(2, new Person("Albanda"));
        map.put(3, new Person("Aliya"));
        //if we try to use the same key with new value
        //it is gonna be overriden and it will change the value to Aliya 2
        // map.put(3, new Person("Aliya 2"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(1));
        System.out.println(map.get(1).name);
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        //we can use .remove(key) method to remove element from map
        System.out.println(map.remove(3));
        System.out.println(map);
        //first way of getting elements
        map.entrySet().forEach(System.out::println);
        //by using lambda expression
        map.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue() + " by lambda expression"));
        //by using map.forEach()
        map.forEach(((key, person) -> {
            System.out.println(key + " " + person.name);
        }));
        //to get all names we can use for loop like that
        for (int key=1;key<=map.size(); key++){
            System.out.println(map.get(key).name);
        }
        //by using getOrDefault method we can try to get element
        //and if key is not assigned to any element it is gonna be null
        //by using getOrDefault method we are going to check it firstly
        //and then assign value to it
        //if key assigned to any value before it is not gonna parse new
        //value to it because it already exists
        System.out.println(map.getOrDefault(3, new Person("default")));
    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        };

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        };

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        //if we do not override then we are gonna get
        //different hash codes for the same objects
        //as it is against Map's rule we should override hashcode method
        //for HashMap<>();
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){

    }
}
