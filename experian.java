
import java.*;


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

//task3


public String solution (int [] stack1, int [] stack2 , int [] stack3) {

    List a1 = Arrays.asList(stack1);
    List a2 = Arrays.asList(stack2);
    List a3 = Arrays.asList(stack3);

    int lastelement1 = stack1[stack1.length-1]; 
    int lastelement2 = stack2[stack2.length-1];
    int lastelement3=  stack3[stack3.length-1];
    String string  = " ";
    
//53
    // as long as one of them is not null;
    //if last number  is the biggest then we append it to the string;
    //and then we pop the element 
    
    while ( stack1  !=null  || stack2 !=null || stack3  !=null){
    if ( lastelement1 > lastelement2 && lastelement1 > lastelement3 ){
        stack1.remove(stack1.length-1);  
    }

    if ( lastelement2 > lastelement1 && lastelement2 > lastelement3 ){
        string.append(2);
        stack2.remove(stack2.length-1);
    }
    if ( lastelement3 > lastelement1 && lastelement3 > lastelemen2 ){
        string.append(3);
        stack3.remove(stack3.length-1);
    }
}

    return string;

}
