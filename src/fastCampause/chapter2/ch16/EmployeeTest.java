package chapter2.ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmployeeName("Lee");

        System.out.println(employee.getEmployeeId());
        System.out.println(Employee.getSerialNum()); //static은 class명으로 불러오는게 맞다.

        Employee employee1 = new Employee();
        employee1.setEmployeeName("Kim");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee1.getEmployeeId());
    }
}
