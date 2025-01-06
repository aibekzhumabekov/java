public class EmployeeClass {

    public static void main(String[] args) {
        // Create Employee objects using the constructor
        Employee me = new Employee("Troy", 35);
        Employee you = new Employee("Dan", 60);

        // Use getters to display initial values
        System.out.println("Initial values:");
        System.out.println(me);
        System.out.println(you);

        // Modify values using setters
        me.setName("Troy Johnson");
        me.setAge(36);

        you.setName("Daniel Smith");
        you.setAge(61);

        // Use getters to display updated values
        System.out.println("\nUpdated values:");
        System.out.println("Name: " + me.getName() + ", Age: " + me.getAge());
        System.out.println("Name: " + you.getName() + ", Age: " + you.getAge());
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
