/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediantwosortedarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author sachin-gupta
 */
public class MedianTwoSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] nums1=new int[]{1,3};
//        int[] nums2=new int[]{2};
        int[] nums1=new int[]{};
        int[] nums2=new int[]{2,3};
        double median=findMedianSortedArrays(nums1,nums2);
        System.out.println("median = "+median);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int source_arr[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, source_arr, 0, nums1.length);
        System.arraycopy(nums2, 0, source_arr, nums1.length, nums2.length);
        Arrays.sort(source_arr);
        if(source_arr.length==0){
            return 0.0;
        }
        else if(source_arr.length==1){
            return (double)source_arr[0];
        }
        int meadianNumber=source_arr.length/2;
        if(source_arr.length%2==0){
            return ((double)(source_arr[meadianNumber-1]+source_arr[meadianNumber]))/2;
        }else{
            return (double)source_arr[meadianNumber];
        }
    }
    
}
