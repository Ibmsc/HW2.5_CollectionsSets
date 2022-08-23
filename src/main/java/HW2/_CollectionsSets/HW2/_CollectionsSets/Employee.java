package HW2._CollectionsSets.HW2._CollectionsSets;

public class Employee {

    private String name;
    private int departmentNumber;
    private int id;
    private static int counter;

    public Employee(String name, int departmentNumber, int id) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.id = ++counter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }
}