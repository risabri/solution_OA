
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

    HashMap<Integer,integer> map = new HashMap<>();

    map.put(1,)

    //i am not sure how to do this one 
    // idea 
    // creating hashmap
    // map each stack to its array value for example
    // stack1 --> 1
    //stack1 -->2
    //stack2-->3
   // stack4-->1
   // stack5-->2
  // but i don't know how to do this without iterating three time ? so o(n^3)
  // thinking merging the three arrays ?
  // or just simply putting all the array vlues into a stack and pop / push ? how to keep track of which stack ?
  // cause i have to return the stack number not the value







}
