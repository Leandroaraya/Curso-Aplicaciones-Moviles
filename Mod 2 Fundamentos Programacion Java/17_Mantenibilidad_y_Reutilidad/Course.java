import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " se inscribió en " + courseName);
    }

    public void teachCourse() {
        System.out.println(teacher.getName() + " está enseñando " + courseName);
    }

    public void provideFeedback(Student student) {
        System.out.println(teacher.getName() + " da feedback a " + student.getName());
    }

    //✅ Ahora todo tiene alta cohesión y bajo acoplamiento. a comparacion con la imagen del ejercicio de la imagen.

}