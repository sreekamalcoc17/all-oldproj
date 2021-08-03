package com.revature.day01.streamex;

import java.util.stream.Stream;

public class CreateStream03 {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0), 
            new Employee(2, "Bill Gates", 250000.0), 
            new Employee(3, "Mark Zuckerberg", 300000.0)
        };
public static void main(String[] args) {
    Stream.Builder<Employee> empStreamBuilder = Stream.builder();

 

    empStreamBuilder.accept(arrayOfEmps[0]);
    empStreamBuilder.accept(arrayOfEmps[1]);
    empStreamBuilder.accept(arrayOfEmps[2]);

 

    Stream<Employee> empStream = empStreamBuilder.build();
    empStream.forEach(e->System.out.println(e));
}
}