package com.datastructures;

import java.util.Arrays;

public class WorkingWith2dArrays {
    public static void main(String[] args) {
        char[][] board  = new char[3][3];
        for(int i=0; i<3;i++){
            for (int j=0;j<3;j++){

                board[i][j] = '-';


            }
        }

        //instead of nested for loop we can just hard code it as below
        char [][] boardTwo = new char[][]{
               new char[] {'O','-','-'},
               new char[] {'O','-','-'},
               new char[] {'O','-','-'}
        };


        board[0][0]='O';
        board[1][0]='O';
        board[2][0]='O';
        //as it is 2D array [][] we have to use deepToString method
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
