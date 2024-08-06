package entities;

public class registration {
    int id_registration;
    int id_course;
    int id_student;

    public registration(){
    }

    public registration(int id_registration, int id_course, int id_student){
        this.id_registration = id_registration;
        this.id_course = id_course;
        this.id_student = id_student;
    }
    public int getId_registration() {
        return id_registration;
    }
    public void setId_registration(int id_registration) {
        this.id_registration = id_registration;
    }
    public int getId_course() {
        return id_course;
    }
    public void setId_course(int id_course) {
        this.id_course = id_course;
    }
    public int getId_student() {
        return id_student;
    }
    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    @Override
    public String toString() {
        return "registration{" +
                "id_registration=" + id_registration +
                ", id_course=" + id_course +
                ", id_student=" + id_student +
                '}';
    }
}
