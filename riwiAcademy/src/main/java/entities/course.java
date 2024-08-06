package entities;

public class course {
    int id_course;
    String name;
    int id_student;

    public course(){
    }
    public course(int id_course, String name, int id_student){
        this.id_course = id_course;
        this.name = name;
        this.id_student = id_student;
    }

    public int getId_course() {
        return id_course;
    }
    public void setId_course(int id_course) {
        this.id_course = id_course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId_student() {
        return id_student;
    }
    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    @Override
    public String toString() {
        return "course{" +
                "id_course=" + id_course +
                ", name='" + name + '\'' +
                ", id_student=" + id_student +
                '}';
    }
}
