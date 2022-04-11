package com.datastructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        //with Set no duplicates allowed
        //but with List we can have duplicated elements
        //we can think it as a bag in which we do not know what is in inside of it
        //it means that Set does not guarantee order
        //if we add bunch element inside of bag
        //we can not get them in the particular order
        //it is like u just pick one thing from bag without seeing
        //and whatever you have in your hand is gonna be what you got from Set
        Set<Ball> balls = new HashSet<>();
        //if we want to use order in our Set<>
        //we can use TreeSet<>() or EnumSet<>()
        balls.add(new Ball("blue"));
        //if we try to duplicate it
        //it is not gonna add it to our Set
        //if we are going to use record for our Set
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());

    }

    //using Set with static class be like that
    //we are needed to override equals method
    //and toString method
    //otherwise we are going to get value differently
    //and it is gonna ignore the rule of Set<>

    //while creating class for Set we have to create constructor
    //and after that we have to override equals method
    //equals method is gonna automatically override
    //equals and hashcode methods
    //then we are overriding toString method to get value's correctly
    //but if we would decide not to override eqauls and hashcode method
    //in that case we are going to get duplicated values as well and
    //it is gonna be calculated in size of Set as well.


    static class Ball{
        String color;
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    //it is faster to use record with Set
    //because we are not going to override anything
//    record Ball(String color){
//
//    }
}
