/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longhestcommonprefix;

import java.util.Arrays;

/**
 *
 * @author sachin-gupta
 */
import java.util.stream.Collectors;
public class LongestCommonPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //String[] strs= new String[]{"flower","flow","flight"};
       String[] strs=new String[]{"dog","racecar","car"};
       String prefix=longestCommonPrefix(strs);
       System.out.println("Prefix = "+prefix);
    }
    public static String longestCommonPrefix(String[] strs) {
        //calculet the min length among the array elements
        int minLength=Arrays.stream(strs).collect(Collectors.summarizingInt(String::length)).getMin();
        Arrays.sort(strs);//sorting the array to only compare the first and last element
        int counter=0;
        //if array size is only 1 then return the same element
        if(strs.length==1){
            return strs[0];
        }else{
            //compairing the first and last element from the sorted array till the min length of array elements
            while(counter<minLength && strs[0].charAt(counter)==strs[strs.length-1].charAt(counter)){
                counter++;
            }//till here
            return strs[0].substring(0,counter);
        }
    }
}
