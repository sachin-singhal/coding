/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twosumproblem;

import java.util.HashMap;
import java.util.Map;
import static twosumproblem.TwoSumProblem.twoSum;

/**
 *
 * @author sachin-gupta
 */
public class anotherApproach {
        public static void main(String[] args) {
//        int[] numsVar=new int[]{2,7,11,15};
//        int target=9;
//        int[] numsVar=new int[]{3,2,4};
//        int target=6;
        int[] numsVar=new int[]{3,3,3};
        int target=6;
        int[] indexArray=new int[2] ;
        indexArray=twoSum(numsVar,target);
        System.out.println("first index = "+indexArray[0]);
        System.out.println("second index = "+indexArray[1]);
    }
        public static int[] twoSum(int[] nums, int target) {
            int[] indexArray=new int[2] ;
            Map<Integer,Integer> valueWithDataStore=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(valueWithDataStore.size()>0 && valueWithDataStore.containsKey(target-nums[i])){
                    indexArray[1]=i;
                    indexArray[0]=valueWithDataStore.get(target-nums[i]);
                    break;
                }else{
                    valueWithDataStore.put(nums[i],i);
                }
            }
            return indexArray;
        }
}
