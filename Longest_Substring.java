/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longest_substring;

/**
 *
 * @author sachin-gupta
 */
public class Longest_Substring {

    /**
     * @param args the command line arguments
     */
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
        String dummyString="";
        if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            
            if(dummyString.contains(String.valueOf(s.charAt(i)))){
                dummyString=dummyString.substring(dummyString.indexOf(s.charAt(i))+1);
            }
            dummyString=dummyString+String.valueOf(s.charAt(i));
            if(dummyString.length()>len){
                len=dummyString.length();
            }
        }
        
        return len;
    }
    
}
