package service;

import data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public void create(String firstname, String secondname, String lastname) {
        int maxId = 0;
        for (Teacher teacher : teacherList)
            if (maxId < teacher.getTeacherId())
                maxId = teacher.getTeacherId();
        teacherList.add(new Teacher(firstname, secondname, lastname, ++maxId));
    }

    @Override
    public void update(String oldFirstname, String oldSecondname, String oldLastname, String newFirstname, String newSecondname, String newLastname) {
        for (Teacher teacher: teacherList) {
            if (teacher.getFirstname().equals(oldFirstname) &&
                    teacher.getSecondname().equals(oldSecondname) &&
                    teacher.getLastname().equals(oldLastname)) {
                teacher.setFirstname(newFirstname);
                teacher.setSecondname(newSecondname);
                teacher.setLastname(newLastname);
            }
        }
    }
}
