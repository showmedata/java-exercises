package org.launchcode.java.PrepExercises;


import java.util.ArrayList;

/**
 * Created by 007 on 3/2/2017.
 */
public class ListArray {
    public static void main(String [] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum = 0;
        for (int num : numbers){
            if (num % 2 == 0 ){
                sum += num;
            }
        }
        System.out.println(sum);
    }
    private static Integer getSumOfEvens(ArrayList<Integer> input){
        Integer count = 0;

        for (int i = 0; i < input.size(); i++){
            if(input.get(i) % 2 == 0){
                count = count + i;
            }
        }
        return count;
    }
}
