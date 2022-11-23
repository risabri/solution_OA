
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

   // ArrayList<int []> list = new ArrayList<int[]>();
    

    

    List a1 = Arrays.asList(stack1);
    List a2 = Arrays.asList(stack2);
    List a3 = Arrays.asList(stack3);

    int last_index1 = a1.size()-1;
    int last_index2 = a2.size()-1;
    int last_index3 = a3.size()-1;
    int last_ele1 = (int) a1.get(last_index1);
    int last_ele2 = (int)a2.get(last_index2);
    int last_ele3 = (int)a3.get(last_index3);


    int maximum = Math.max(last_ele1, Math.max(last_ele2,last_ele3));
 

    if ( maximum == last_ele1 ){
        a1.remove(last_ele1);
        s="1-";

    }
    if ( maximum == last_ele2 ){
        a2.remove(last_ele2);
        s="2-";

    }
    if ( maximum == last_ele3 ){
        a3.remove(last_ele3);
        s="3-";

    }

    return s;

    }


    public static void main(String[] args){
        
        int [] stack1= {2,7};
        int [] stack2 = {4,5};
        int [] stack3 = {1};

        System.out.print(solution(stack1,stack2,stack3));



    }



}

