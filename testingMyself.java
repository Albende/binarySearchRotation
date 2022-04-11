package com.datastructures;

import java.util.Scanner;

public class testingMyself {
//    static int BinarySearch(int myArray[], int n, int x){
//        int start = 0;
//         int end = n;
//         while(start<=n){
//             //int mid = (start+end)/2; //sometimes it can overflow
//             //because sometimes start + end can exceed the maximum value
//             //which integer can store
//             //that's why the following way is better
//             //that's why it is better to use the mid as following
//             int mid = start + (end-start)/2; // it helps us to calculate more big values
//             if(x==myArray[mid]){
//                 return mid;
//             } else if(x<myArray[mid]){
//                 end = mid-1;
//
//             } else {
//                 start = mid+1;
//
//             }
//
//        }
//
//        return -1;
//    }



    static int BinarySearch(int[] A, int n, int x, boolean searchingFirst) {

        int first = 0;
        int last = n;
        int result = -1;
        while (first <= n) {
            int mid = first + (last-first)/2;
            if (A[mid] == x) {
                result = mid;
                if (searchingFirst==true) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else if (x < A[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] a = new int[4];
//        a[0]=10;
//        a[1]=1;
//        a[2]=4;
//        a[3]=5;

//        int [] b = {2,6,13,21,36,47,63,81,97};
        int[] c = {1,1,3,3,5,5,5,5,5,9,9,11};
        System.out.println("Enter a number to search: ");
        int number = sc.nextInt();

        int firstIndex = BinarySearch(c, c.length-1, number, true);
        if(firstIndex==-1){
            System.out.println("count of " + number + " is " + 0);
        } else{
            int lastIndex = BinarySearch(c, c.length-1, number, false);
            System.out.println("count of " + number + " is " + (lastIndex-firstIndex+ 1));
        }

        //we can find count occurance by justing looping through array
        //running time of this alghoritm is equal to O(n) big o notation of n
        //but if we would try it by using BinarySearch algorithm then
        //time complexity of it would be t of O(log(n))
        //if we would use binarySearch and all the elements
        //would be equal to the eachother then time complexity would be O(n)
//        for( int i= 0;i<lengthOfC; i++){
//            if(number==c[i]){
//                count++;
        //we are using it to optimize the algorithm
//            } else if(c[i]>number{
//            break
//            }
//        }
//        System.out.println(count);


//       int index = BinarySearch(b,b.length-1,number);
//       if (index!=-1){
//           System.out.println("Number " + number + " found at index " + index);
//       } else{
//           System.out.println("We could not find " + number + " in our array");
//       }
//        Arrays.stream(a).forEach(System.out::println);

//
//        for (int i=0;i<a.length;i++){
//            if(number==a[i]){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
//        }

    }
}
