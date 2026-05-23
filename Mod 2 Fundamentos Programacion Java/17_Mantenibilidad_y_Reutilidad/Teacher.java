class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void teachCourse(Course course) {
        course.teachCourse();
    }

    public void provideFeedback(Course course, Student student) {
        course.provideFeedback(student);
    }
    //✅ Ahora todo tiene alta cohesión y bajo acoplamiento. a comparacion con la imagen del ejercicio de la imagen.

}