package array;

/**
* author:  Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-11
*/

public class MDArrayJava{
    public static void main(String[] args){
        
//One Dimensional Arrays
    int[] fisrtArray = {2, 5, 3};
    int[] secondArray = {9, 5, 3};
    int[] thirdArray = {2, 4, 9};
    int[] fourthArray = {10, 11, 12};
    int[] fifthArray = {13, 14, 15};
    int[] sixthArray = {16, 17, 18};
    int[] seventhArray = {19, 20, 21};
    int[] eighthArray = {22, 23, 24};
    int[] ninthArray = {25, 26, 27};

//Two Dimensional Arrays
    int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
    int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
    int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

//Three Dimensional Array
    int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

//printing Element of Three Dimensional Array with nested-for looping
    for(int p=0; p<threeDimensionalArray.length; p++){
        System.out.print("{");
        for(int q=0; q<threeDimensionalArray[p].length; q++){
            System.out.print("{");
            for(int r=0; r<threeDimensionalArray[p][q].length; r++){
                System.out.print(threeDimensionalArray[p][q][r] + " ");
            }
            System.out.print("} ");
        }
        System.out.print("} ");
        System.out.println();
    }
}
}
