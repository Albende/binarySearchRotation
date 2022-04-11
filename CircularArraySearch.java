package com.datastructures;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircularArraySearch {
    //this is valid only if there is not duplicated elements
    //because if there is duplicates in the array then
    //program will not be able to decide whether right or left is sorted array
    //if array is duplicate it is better to perform lienar search by using
    //for loop
    static int circularArraySearch(int[] A, int n, int x){
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int mid = (high+low)/2;
            if(A[mid]==x){
                return mid;
            } else if(A[mid]<=A[high]){
                if(x>A[mid] && x<=A[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            } else if(A[low]<=A[mid]){
                if(x>=A[low] && x<A[mid]){
                    high = mid - 1;
                }else{
                    low=mid+1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input");
        int input = sc.nextInt();
        int[] A = {12,14,18,21,3,6,8,9};
        int index = circularArraySearch(A,8,input);
        if(index!=-1){
            System.out.println("index of number " + input + " is "+ index);
        }else{
            System.out.println("could not find your input " + input + " in array");
        }
    }
}
