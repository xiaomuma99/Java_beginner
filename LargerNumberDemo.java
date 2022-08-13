public class LargerNumberDemo {
    /** larger function is use to return the larger number*/
    public static int larger(int x, int y){
        if(x < y){
            return y;
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println(larger(-2,100));
    }

}

/*
1. Functions must be declared as part of a class in Java.
   A function that is part of a class is called a "method".
   so in Java, all functions are methods.
2. To define a function in Java, we use "public static".
   We will see alternate ways of defining functions later.
 */
