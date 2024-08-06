package entities;

public class student {
    int id_student;
    String name;
    String email;
    String password;
    Boolean status;

    public student(){
    }

    public student(int id_student, String name, String email, String password, Boolean status){
        this.id_student = id_student;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public int getId_student() {
        return id_student;
    }
    public void setId_student(int id_student) {
        this.id_student = id_student;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "student{" +
                "id_student=" + id_student +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }


}
