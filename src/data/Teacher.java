package data;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstname, String secondname, String lastname, int teacherId) {
        super(firstname, secondname, lastname);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstname='" + super.getFirstname() + '\'' +
                ", secondname='" + super.getSecondname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                '}';
    }
}
