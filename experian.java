
 import java. util. *;
 import java.lang.StringBuilder;

/*
//task1

int Solution ( public int solution(int X, int Y, int[] A) ){

    //does this cover negative numbers as well ?
    int result = -1;
    count_X =0;
    count_Y=0;
    int length = A.length; 

    for ( int i=0; i <length; i++){
        if ( A[i]==X){
            count_X++;
        }
        if ( A[i]==Y){
            count_Y++;
        }

        if (count_X == count_Y){
            result =i;
        }

    }
    return result;
   

}
//task2

public int solution(String s) {

    int count=1;
    int res =0;

    for ( int i =0; i<s.length()-1; i++){

        if ( s.charAt(i)!= s.charAt(i+1) ){
            // make sure update res so it can continue to read the string after finding the consec three number
            if ( count >=3){
                res = res + count /3;

            }
            count =1;
        } else {
            count++;
        }
    }

        if ( count>=3)
            res = res+ count /3;
        return res;
    }
}

}
*/

//task3

 class Solution {

 public static String solution(int [] stack1, int [] stack2 , int [] stack3) {



    String s = "";
    int c1 = stack1.length - 1;
    int c2 = stack2.length - 1;
    int c3 = stack3.length - 1;
    int ele1 = 0, ele2 = 0, ele3 = 0;
    while (ele1 != Integer.MIN_VALUE || ele2 != Integer.MIN_VALUE || ele3 != Integer.MIN_VALUE) {
        // System.out.println(ele1 + " " + ele2 + " "+ ele3);
        if (c1 < 0) {
            ele1 = Integer.MIN_VALUE;
        } else {
            ele1 = stack1[c1];
        }
        if (c2 < 0) {
            ele2 = Integer.MIN_VALUE;
        } else {
            ele2 = stack2[c2];
        }
        if (c3 < 0) {
            ele3 = Integer.MIN_VALUE;
        } else {
            ele3 = stack3[c3];
        }
        if (ele1 > ele2 && ele1 > ele3) {
            s+="1-";
            c1--;
        }
        if (ele2 > ele1 && ele2 > ele3) {
            s+="2-";
            c2--;
        }
        if (ele3 > ele1 && ele3 > ele2) {
            s+="3-";
            c3--;
        }
    }
    return s.substring(0, s.length() - 1);
    
}
    

    

    public static void main(String[] args){
        
        int [] stack1= {2,7};
        int [] stack2 = {4,5};
        int [] stack3 = {1};

        System.out.print(solution(stack1,stack2,stack3));



    }



}

