public class EmployeeClass {

    public static void main(String[] args) {
        Employee me = new Employee("Troy", 35);
        Employee you = new Employee("Dan", 60);

        System.out.println(me);
        System.out.println(you);
    }
}

class Employee {

    private int age;
    private String name;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}
