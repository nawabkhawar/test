package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String args[]){
        List<String> demoList = new ArrayList<>();
        demoList.add("");
        demoList.add("12");
        demoList.add("abc");
        demoList.add("wow");

        //collect example
        demoList.forEach(System.out::println);
        List<String> filteredList = demoList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        filteredList.forEach(System.out::println);

        //new Random
        new Random().ints().limit(10).forEach(System.out::println);

        //stream map example
        Arrays.asList(2,3,6,8,9).stream().map(i->i*i).collect(Collectors.toList()).forEach(System.out::println);






    }

}
