package com.DSA;

public class NdoubleExist {
    public static void main(String[] args) {

    }
//Check If N and Its Double Exist
    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr.length ; j++){
                if(i==j){
                    continue;
                }
                if(arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
