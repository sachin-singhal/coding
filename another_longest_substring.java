/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_substring;

import java.util.HashMap;

/**
 *
 * @author sachin-gupta
 */
public class another_longest_substring {
    public static void main(String[] args) {
//        String s="abcabcbb";
//        String s="bbbbb";
//        String s="pwwkew";
//          String s=" ";
//          String s="aab";
          String s="dvdf";
        int len=lengthOfLongestSubstring(s);
        System.out.println("length is = "+len);
    }
    public static int lengthOfLongestSubstring(String s) {
         int len=0;
        HashMap<Character,Integer> checkVal=new HashMap<Character,Integer>();
        String checkVar="";
        String subString="";
        char ch;
        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(!checkVal.containsKey(ch)){
                checkVal.put(ch,i);
            }
            else{
                i=checkVal.get(ch);
                checkVal.clear();
            }
            if(checkVal.size()>len){
                len=checkVal.size();
                subString=checkVal.keySet().toString();
                System.out.println("subString = "+subString);
            }
        }
        return len;
    }
}
