package com.datastructures;

public class binarySearchRotation {

    public static int findingRotationCount(int[] A, int n){
        int low = 0;
        int high = n-1;
        while(low<=high){
            if(A[low]<=A[high]){
                return low;
            }
            int mid = (low+high)/2;
            int next = (mid+1)%n;
            int prev = (mid+(n-1))%n;
            if(A[mid]<=A[next]&&A[mid]<=prev){
                return mid;
            }else if(A[mid]<=A[high]){
                high = mid - 1;
            }else if(A[mid]>=A[low]){
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //finding rotation count of sorted array
        // it is only applicable to the case scenario
        //when there is no duplicated element in sorted array
        int[] A = {15, 22, 23, 28, 31, 38,5,6,8,10,12};
        int count = findingRotationCount(A, 11);
        System.out.println("the array is rotated " + count + " times");


//    int min=A[0];
//    int minIndex  = -1;
//    //time complexity of it is O(n) as it is linear function
//    for(int i=0;i<A.length;i++){
//        if(A[i]<min){
//            min = A[i];
//            minIndex=i;
//        }
//    }
//        System.out.println(minIndex);
    }
}



