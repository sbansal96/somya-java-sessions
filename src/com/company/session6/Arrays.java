package com.company.session6;

public class Arrays {

    public static void main(String[] args) {

        // Homogenous

//        int[] intArray1 = {0,1,2,3};

        int[] intArray = new int[20];

//        System.out.println(intArray1.length);
        System.out.println(intArray.length);


//        intArray1[3] = 4;
        intArray[4] = 4;

        // for each {Iterator}
        for(int i : intArray){
            System.out.println(i);
        }

        for(int i =0 ; i<intArray.length;i++){
            System.out.println(i + " : " +intArray[i]);
        }

        int[] newArray = new int[21];

        for(int i =0 ; i<intArray.length;i++){
            newArray[i] = intArray[i];
        }
//        intArray[20] = 5;
        newArray[1] = 5;
        int count = 0;
        for(int i =0 ; i<newArray.length;i++){
            count+=1;
            if(newArray[i] == 5){
                System.out.println(true);
            }
        }

        System.out.println(count);


    }

}
