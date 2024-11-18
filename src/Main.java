import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna",5));
        students.add(new Student("Sofia",3.5));
        students.add(new Student("Andriana",3.5));
        students.add(new Student("Angelina",4));
        students.add(new Student("Maria",5));
        students.sort(new BallAndNameComparator());
          for (Student student: students){
              System.out.println(student);
          }

    }
}
