package ch03.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
        List<Employee> employeList = names.stream().map(Employee::new).collect(Collectors.toList());
        for (Employee e : employees) System.out.println("@"+e.getName());
        for (Employee e : employeList) System.out.println("!"+e.getName());
    }
}
