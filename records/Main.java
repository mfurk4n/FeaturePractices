package records;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Furkan", "Turkish");
        System.out.println(student.name());
        System.out.println(student.nationality());
        System.out.println(Student.getAge());
    }
}
