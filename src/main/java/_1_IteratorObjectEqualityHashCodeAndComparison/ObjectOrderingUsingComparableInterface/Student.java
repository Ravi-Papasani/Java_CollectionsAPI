package _1_IteratorObjectEqualityHashCodeAndComparison.ObjectOrderingUsingComparableInterface;

//Objects Sorting or comparison using Comparable interface implementation
public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private int id;
    private String department;

    public Student(String firstName, String lastName, int id, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        /*if(this.id == o.getId()) return 0;
        else if(this.id > o.getId()) return 1;
        else if(this.id < o.getId()) return -1;
        Above three lines of code can be replace using this.id - o.getId()
        */
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
