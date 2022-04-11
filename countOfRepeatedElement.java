package com.datastructures;

import java.util.Scanner;

public class countOfRepeatedElement {

    public static int BinarySearch(int[] A, int target, boolean firstSearch){
        int low = 0;
        int high = A.length-1;
        int result = -1;
        while(low<=high){
            int mid = (high+low)/2;
            if(A[mid]==target){
                result = mid;
                if(firstSearch==true){
                    high = mid-1;
                } else{
                    low=mid+1;
                }
            } else if(target<A[mid]){
                high=mid-1;
            } else{
                low = mid+1;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1,1,3,3,5,5,5,5,5,9,9,11};
        int f = A.length;

        System.out.println("enter your number: ");
        int input = sc.nextInt();

        int firstIndex = BinarySearch(A, input, true);
        int lastIndex = BinarySearch(A, input, false);

        if(firstIndex!=-1){
            System.out.println("number of occurance is " + (lastIndex-firstIndex+1));
        } else{
            System.out.println("Target not found");
        }
    }
}