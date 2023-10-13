import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      List<Student> students = new ArrayList<>();
      students.add(new Student<>(15,"Alymbekovich"));
      students.add(new Student<>(16,"Kolbaevich"));
      students.add(new Student<>(17,"Kanatovich"));
      students.add(new Student<>(18,"Taalaibekovich"));
      students.add(new Student<>(19,"Esenkulovich"));
      List<Object> student = students.stream().map(x->x.SureName).collect(Collectors.toList());
        System.out.println(student);

    }
}