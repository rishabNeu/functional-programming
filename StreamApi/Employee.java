package StreamApi;

public class Employee {
    private int id;
    private String name;
    private String dept ;
    private long salary;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee(int id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public long getSalary() {
        return salary;
    }

    
}
