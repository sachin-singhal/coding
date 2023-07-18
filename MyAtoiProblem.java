/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myatoiproblem;

/**
 *
 * @author sachin-gupta
 */
public class MyAtoiProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("first case = "+myAtoi("42"));
        //System.out.println("first case = "+myAtoi("   -42"));
        //System.out.println("first case = "+myAtoi("4193 with words"));
        System.out.println("first case = "+myAtoi("   +0 123"));
        //System.out.println("first case = "+myAtoi("+12"));
        System.out.println("Max value = "+Integer.MAX_VALUE);
        System.out.println("Max value = "+Integer.MIN_VALUE);
    }
    public static int myAtoi(String s) {
        char[] charArray=s.toCharArray();//convert string into character array
        boolean bNumPrsenet=false;//this flag value will be true when one +,-, number will get then it will be true
        int returnNumber=0;//to return the number
        int sign=0;//when + is present then it would be 1 and when - is present then it would be -1
        int i=0;
        while(i<charArray.length){
            //to check the + sign in ascii
            if((int)charArray[i] == 43){
                if(!bNumPrsenet && sign==0){
                    sign=1;
                    bNumPrsenet=true;
                    i++;
                }else{
                    break;
                }//till here to check the + sign in ascii 
            }
            //to check the - sign in ascii
            else if((int)charArray[i] == 45){
                if(!bNumPrsenet && sign==0){
                    sign=-1;
                    bNumPrsenet=true;
                    i++;
                }else{
                    break;
                }
            }//till here to check the - sign in ascii 
            //to check the space sign in ascii
            else if ((int)charArray[i] == 32) {
                if (!bNumPrsenet) {
                    i++;
                } else {
                    break;
                }
            }//till here to check the space sign in ascii
            //to check the number in ascii
            else if ((int)charArray[i] >= 48 && (int)charArray[i] <= 57) {
                bNumPrsenet=true;
                //condition to check the number will not be greater then the int limit to clamp the value
                if(returnNumber>(Integer.MAX_VALUE/10) || (returnNumber==(Integer.MAX_VALUE/10) && charArray[i]-'0' >7 )){
                    if(sign==1){
                        returnNumber=Integer.MAX_VALUE;
                    }else{
                        returnNumber=Integer.MIN_VALUE;
                    }
                    break;
                }//till here to check the number will not be greater then the int limit to clamp the value
                returnNumber=10*returnNumber+charArray[i++]-'0';
                if(sign==0){
                    sign=1;
                }
            } else {
                break;
            }
        }
            returnNumber=sign * returnNumber;
        return returnNumber;
    }
}
