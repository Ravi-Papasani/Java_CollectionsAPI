package _5_Map;

import java.util.HashMap;
import java.util.Map;
import _5_Map.Student;

public class MapImpl {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Student student1 = new Student("John","Raj",102,"Maths");
        Student student2 = new Student("Alex","Gr",101,"Arts");
        Student student3 = new Student("Rob","Cart",103,"Science");

        students.put(1,student1);
        students.put(2,student2);
        students.put(3,student3);

        for(Map.Entry<Integer, Student> entry : students.entrySet()){
            int key = entry.getKey();
            Student stu = entry.getValue();
            //System.out.println(key+" Details:");
            //System.out.println(stu.getId()+" "+stu.getFirstName()+" "+stu.getLastName()+" "+stu.getDepartment());
            System.out.println(entry.getKey() + "=>" + entry.getValue().getFirstName());
        }

    }
}
