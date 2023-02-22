package com.company;

public class Main {

    static int[] massive = {1, 3, 4, 1, 0, 8, 7, 6, 8, 9, 3, 2, 7, 9, 4, 1, 3, 5};
    static int[] resultArray = new int[2];



    public static void main(String[] args) {
        findPalinom(massive, 0, massive.length - 1);
        System.out.println(resultArray[0] + " " + resultArray[1]);
    }

    public static boolean isPalinom(int[] massive, int startIndex, int endIndex){

        if (startIndex < 0 || endIndex < 0) {
            return false;
        }

        if (startIndex == endIndex) {
            return false;
        }

        if (endIndex - startIndex == 1 && massive[startIndex] == massive[endIndex]) {
            return true;
        }

        if (massive[startIndex] == massive[endIndex]) {

            return isPalinom(massive, startIndex + 1, endIndex - 1);
        } else {
            return false;
        }



    }

    public static int[] findPalinom(int[] massive, int startIndex, int endIndex){

        if(isPalinom(massive, startIndex, endIndex)){
            resultArray[0] = startIndex;
            resultArray[1] = endIndex;
            return resultArray;
        }

        if(massive.length / 2 - startIndex <= 1 && endIndex - massive.length / 2 <= 1){

            return resultArray;
        }

        if(endIndex - startIndex <= 1) {

            return findPalinom(massive, startIndex + 1, massive.length - 1);
        } else {

            return findPalinom(massive, startIndex, endIndex - 1);
        }


    }
}


