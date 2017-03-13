package com.harnastaeu.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by dzmitry.harnastaeu on 2/2/17.
 */
public class Tester {

    public static void main(String [] args){
        List<Person> personList = new ArrayList<Person>(5);
        personList.add(new Person("dima1", 20));
        personList.add(new Person("dima2", 21));
        personList.add(new Person("dima3", 22));
        personList.add(new Person("dima4", 23));
        personList.add(new Person("dima5", 24));

        Set<String> names = personList.stream().map(p -> p.getName()).collect(Collectors.toSet());
//        for (String name : names){
//            System.out.println(name);
//        }

        Map<String, Person> result =
                personList.stream().collect(Collectors.toMap(Person::getName,
                        Function.identity()));
        for(Person p : result.values()){
            System.out.println(p.getName());
        }

    }
}
