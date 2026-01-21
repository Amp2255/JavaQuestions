//Description

//Given a list of employees, return a List<String> of names where:

//age > 30

//sorted by age, then name
package someqns;
import java.util.*;
import java.util.logging.Logger;


class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StreamTest {
    private static Logger commonLogger = Logger.getLogger(StreamTest.class.getName());


    // public static List<String> filterAndSort(List<Employee> employees) {
    //     return employees.stream()
    //         .filter(e-> e.age>30)
    //         .collect(toList());
    // }

    public static void main(String[] args) {
        System.out.println("test out sysout");
        commonLogger.info("test out");
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 32),
                new Employee("Bob", 29),
                new Employee("Carl", 35),
                new Employee("David", 32)
        );
        for(int i=0;i<list.size();i++){
            commonLogger.info("test out");
            System.out.println(list.get(i));
        }
        
        
       // commonLogger.info(filterAndSort(employeeslist)); 
        // Expected: [Alice, David, Carl]
    }
}

