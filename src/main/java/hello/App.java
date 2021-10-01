package hello;

import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("----------app----------");

        // ---------------------------------------
        // init template model
//        Test <Integer> iObj = new Test<Integer>(15);
//        System.out.println(iObj.obj);

        // ---------------------------------------
        User user= new User(1,"hunter","ht@gmail.com");
        User value= get(user);
        System.out.println(value.toString());

        // ---------------------------------------
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArray(intArray);

        // ---------------------------------------
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.println("----------app end----------");
    }

    static <T> T get(T value){
        return value;
    }

    public static <E> void printArray( E[] inputArray ) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }
}
