/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zigzagproblem;

/**
 *
 * @author sachin-gupta
 */
public class ZigZagProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        //System.out.println("converted string = "+convert(s,3));
        //System.out.println("converted string = "+convert(s,4));
        s="AB";
        System.out.println("converted string = "+convert(s,1));
    }
    public static String convert(String s, int numRows) {
        String returnString="";
        int rowCount=0;
        int charIndex=0;
        boolean bColFinished=true;
        if(numRows==1){
            return s;
        }else{
            //to print the first row
            while(charIndex<s.length()){
                returnString=returnString+(s.charAt(charIndex));
                charIndex=charIndex+(numRows-1)*2;
            }//till here to print the first row
            //to print the middle rows element
            for(rowCount=1 ; rowCount<numRows-1 ; rowCount++){
                bColFinished=true;
                for(charIndex=rowCount;charIndex<s.length();){
                    returnString=returnString+(s.charAt(charIndex));
                    if(bColFinished){
                        charIndex=charIndex+(numRows-1-rowCount)*2;
                        bColFinished=false;
                    }else{
                        charIndex=charIndex+((numRows-1)*2 - (numRows-1-rowCount)*2);
                        bColFinished=true;
                    }
                }
            }//till here to print the middle rows element
            //to print the last rows element
            charIndex=numRows-1;
            while(charIndex<s.length()){
                returnString=returnString+(s.charAt(charIndex));
                charIndex=charIndex+(numRows-1)*2;
            }//till here to print the last rows element
        }
        return returnString;
    }
    
}
