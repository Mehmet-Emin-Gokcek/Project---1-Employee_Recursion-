import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Employee {
    String name = null;
    String manager = null;
    ArrayList<Employee> employeeList = new ArrayList<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public Employee createEmployee(String name, String manager) {//create employee object

        Employee employee = new Employee();
        employee.setName(name);
        employee.setManager(manager);
        return employee;
    }


    public String toString() {
        // Custom a string representation
        return "name:" + name + " Manager:" + manager;
    }



    public void fileRead(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) { //continue as long as readLine has something to read

                String[] splitted= sCurrentLine.split(" ");//data is split by character space
                if (splitted.length > 1) {
                    String splitted1 = splitted[0]; //employee  name
                    String splitted2 = splitted[1]; //manager name

                    if (!splitted1.equals("Name") && !splitted2.equals("Manager")) {
                        Employee employee1 = createEmployee(splitted1, splitted2); //call for object creation
                        employeeList.add(employee1);// add employee object to the list
                    }
                }

                else if (splitted.length == 1) {
                    String splitted1 = splitted[0];
                    Employee employee1 = createEmployee(splitted1 , ""); //call for object creation
                    employeeList.add(employee1);// add employee object to the list

                }

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
