package java18;

import java.util.stream.IntStream;

public class Count {
    public static void main(String[] args){
        char[] arr={'a','b','b','a','c','d','a'};
        char target='a';

        long count= IntStream.range(0, arr.length).filter(i -> arr[i] == target).count();
        System.out.println("count ="+count);
    }
}
