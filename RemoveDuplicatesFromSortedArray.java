/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removeduplicatesfromsortedarray;

import java.util.Arrays;

/**
 *
 * @author sachin-gupta
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] intArray=new int[]{1,1,2};
        int length=removeDuplicates(intArray);
        System.out.println("length ="+length);
    }
    public static int removeDuplicates(int[] nums) {
        int length=0;
        int[] removingDuplicateArr=Arrays.stream(nums).distinct().toArray();//it will delete the duplicate elements from the array
        Arrays.stream(removingDuplicateArr).forEach(e->System.out.println(e));//printing the array elements
        return removingDuplicateArr.length;
    }
    
}
