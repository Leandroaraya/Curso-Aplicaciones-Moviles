class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this);

        //✅ Ahora todo tiene alta cohesión y bajo acoplamiento. a comparacion con la imagen del ejercicio de la imagen.

    }
}