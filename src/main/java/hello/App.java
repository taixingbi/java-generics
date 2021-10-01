package hello;

import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("----------app----------");

        // init template model
//        Test <Integer> iObj = new Test<Integer>(15);
//        System.out.println(iObj.obj);

        //

        User user= new User(1,"hunter","ht@gmail.com");
        User value= get(user);
        System.out.println(value.toString());

        System.out.println("----------app end----------");
    }

    static <T> T get(T value){
        return value;
    }
}
