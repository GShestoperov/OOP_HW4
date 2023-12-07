package controller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstname, String secondname, String lastname) {
        teacherService.create(firstname, secondname, lastname);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    @Override
    public void update(String oldFirstname, String oldSecondname, String oldLastname, String newFirstname, String newSecondname, String newLastname) {
        teacherService.update(oldFirstname, oldSecondname, oldLastname, newFirstname, newSecondname, newLastname);
    }
}
