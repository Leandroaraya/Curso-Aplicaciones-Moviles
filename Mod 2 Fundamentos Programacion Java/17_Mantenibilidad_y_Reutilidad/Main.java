public class Main {
    public static void main(String[] args) {
        Teacher prof = new Teacher("Juan");
        Student s1 = new Student("Ana", 20, 4.5);
        Student s2 = new Student("Luis", 22, 3.8);

        Course math = new Course("Matemáticas", prof);

        s1.enrollInCourse(math);
        s2.enrollInCourse(math);

        prof.teachCourse(math);
        prof.provideFeedback(math, s1);
    }
    //✅ Ahora todo tiene alta cohesión y bajo acoplamiento. a comparacion con la imagen del ejercicio de la imagen.

}