package Java_Assignment;
import java.util.HashMap;
import java.util.Map;
//If EmpNo=123 then EmpName=Jadeja. Like this how can we keep 100 EmpName with its EmpId?
public class Problem_11 {
    public static void main(String[] args) {
        Map<Integer, String> employeeData = new HashMap<>();

        // Adding EmpId-EmpName pairs for 100 employees
        employeeData.put(101, "John");
        employeeData.put(102, "Jane");

        // Add more EmpId-EmpName pairs as needed
        // ...

        employeeData.put(200, "Alice");

        // Accessing EmpName for a specific EmpId
        int empIdToLookup = 123;
        String empName = employeeData.get(empIdToLookup);

        if (empName != null) {
            System.out.println("EmpId: " + empIdToLookup + ", EmpName: " + empName);
        } else {
            System.out.println("No EmpName found for EmpId: " + empIdToLookup);
        }
    }
}