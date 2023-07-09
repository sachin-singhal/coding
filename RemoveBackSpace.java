/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_substring;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author sachin-gupta
 */
public class RemoveBackSpace {
    public static void main(String[] args){
//        String s="gee##eeks";
//        String abc=removeBackspace(s);
        //sample 1
//        String s="ab#c";
//        String t="ad#c";

        String s="ab##";
        String t="c#d#";
        
//        String s="a#c";
//        String t="b";
//        String s="y#fo##f";
//        String t="y#f#o##f";
        //System.out.println("String match s= "+removeBackspace(s));
        System.out.println("String match t= "+removeBackspace2(t));
        if(removeBackspace2(s).equals(removeBackspace2(t))){
            System.out.println("String match = "+true);
        }else{
            System.out.println("String match = "+false);
        }
    }
    //Approach1
    public static String removeBackspace(String sample){
        String removeBackspaceString="";
        ArrayList<Character> abc=new ArrayList<>(sample.chars().mapToObj(x->(char)x).collect(Collectors.toList()));
        ArrayList<Character> abcVal=new ArrayList<>();
        abc.stream().forEach(a->{
            if(String.valueOf(a).equals("#") ){
                if(abcVal.size()>0)
                    abcVal.remove(abcVal.size()-1);
            }else{
                abcVal.add(a);
            }
        });
        removeBackspaceString=abcVal.toString();
        return removeBackspaceString;
        
    }
    
    //approach2
    public static String removeBackspace2(String sample){
        String removeBackspaceString="";
        for(int i=0;i<sample.length();i++){
            if(String.valueOf(sample.charAt(i)).equals("#")){
                if(removeBackspaceString.length()>0){
                    removeBackspaceString=removeBackspaceString.substring(0,removeBackspaceString.length()-1);
                }
            }else{
                removeBackspaceString=removeBackspaceString+String.valueOf(sample.charAt(i));
            }
        }
        return removeBackspaceString;
    }
}
