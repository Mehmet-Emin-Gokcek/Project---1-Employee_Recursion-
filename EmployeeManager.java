import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManager {


    int counter  = 0;

    public int countEmployeesUnder(String employeeName, ArrayList <Employee> list) {

        for (int i = 0; i < list.size(); i++) {

            String Manager = list.get(i).manager; //manager name
            String employee = list.get(i).name; //employee name

            if (Manager.equals(employeeName)) {// if manager name is the same as requested manager name

                counter ++;

                countEmployeesUnder(employee, list);  //this is where recursion is used
            }
        }

        return counter;
    }



    public static void main(String[] args) throws IOException {

        String employeeName = "Sally"; // input manager name to calculate # of employees working under her/him

        Employee read = new Employee(); //ReadFile class reads database file (employee.txt) and saves it into an ArrayList

        read.fileRead("C:\\Users\\mgokcek\\IdeaProjects\\recursion\\src\\employee.txt"); //location of employee database file

        EmployeeManager emp = new EmployeeManager(); //calling the method that calculates # of employees for each manager

        int count = emp.countEmployeesUnder(employeeName, read.employeeList);
        System.out.println("Requested manager, '" + employeeName +"' has " + count + " employees working under him/her.");


    }
}