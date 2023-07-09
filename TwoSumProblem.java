/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosumproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
 *
 * @author sachin-gupta
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* 
Input: nums = [3,2,4], target = 6
Output: [1,2]
* 
Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSumProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] numsVar=new int[]{2,7,11,15};
//        int target=9;
//        int[] numsVar=new int[]{3,2,4};
//        int target=6;
        int[] numsVar=new int[]{3,3};
        int target=6;
        int[] indexArray=new int[2] ;
        indexArray=twoSum(numsVar,target);
        System.out.println("first index = "+indexArray[0]);
        System.out.println("second index = "+indexArray[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexArray=new int[2] ;
        
        //this block will not work because we don't have any exit condition of loop
//        numArrayList.stream().forEach(e->{
//           if(numArrayList.contains(target-e)){
//               indexArray[0]=numArrayList.indexOf(e);
//               indexArray[1]=numArrayList.indexOf(target-e);
//           }
//           
//        });
        //this block will not work for third input where it will conatin same input
        ArrayList<Integer> numArrayList= (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
        AtomicBoolean yes = new AtomicBoolean(true);
        numArrayList.stream().takeWhile(obj->yes.get()).forEach(obj->{
            if(numArrayList.contains(target-obj) && numArrayList.indexOf(obj) !=numArrayList.indexOf(target-obj)){
               indexArray[0]=numArrayList.indexOf(obj);
               indexArray[1]=numArrayList.indexOf(target-obj);
               yes.set(false);
           }
        });
        //till here for this block will not work for third input where it will conatin same input
        return indexArray;
    }
}
