package com.company.session6;

public class Array2DExample {

    public static void main(String[] args) {
        int[][] intArray = new int[3][3];
        /**
         *  0 0 0
         *  0 0 0
         *  0 0 0
         */

        /**
         *  (0,0) (0,1) (0,2)
         *  (1,0) (1,1) (1,2)
         *  (2,0) (2,1) (2,2)
         */

        for (int i = 0; i < 3; i++) {
            System.out.println(intArray[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(intArray[i][j]);
                System.out.println("index : " +i +","+j);
            }
        }

        /**
         * Actual representation of 2D array
         * [[],[],[]]
         *
         *  3D array
         *  [[[],[],[]],[[],[],[]],[[],[],[]]]
         *
         *
         */

    }

}
