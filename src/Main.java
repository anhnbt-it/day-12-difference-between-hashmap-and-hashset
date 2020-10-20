import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/20/2020
 * Time: 1:57 PM
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Khoai", 1, "HN");
        Student st2 = new Student("Rose", 25, "TN");
        Student st3 = new Student("Anh", 25, "BG");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, st1);
        studentMap.put(2, st2);
        studentMap.put(3, st3);
        studentMap.put(4, st1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("------SET------");
        Set<Student> students = new HashSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st1);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
