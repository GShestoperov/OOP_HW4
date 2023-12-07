import controller.TeacherController;
import data.Teacher;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        teacherController.create("Иван", "Иванович", "Иванов");
        teacherController.create("Петр", "Петрович", "Петров");
        teacherController.create("Сидр", "Сидорович", "Сидоров");

        teacherController.sendOnConsole();
        System.out.println();

        teacherController.update("Сидр", "Сидорович", "Сидоров",
                                    "Андрей", "Григорьевич", "Малышев");

        teacherController.sendOnConsole();
    }
}
