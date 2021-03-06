package Control;

import Entity.Student;

import java.util.Scanner;

public class StudentUI {
    /**
     * A student object.
     */
    private Student student;
    //Course course;

    /**
     * Creates the StudentUI.
     *
     * @param s This is the student object
     */
    public StudentUI(Student s) {
        this.student = s;
    }

    /**
     * A method that is a studentMenu.
     * It allows the student to pick what they wants to do, of the 7.
     */
    public void studentMenu() {
        Scanner sc = new Scanner(System.in);
        StudentControl scontrol = new StudentControl(this.student);
        int choice = 0;

        do {
            System.out.println("1. Add course");
            System.out.println("2. Drop course");
            System.out.println("3. Check/Print courses registered");
            System.out.println("4. Check vacancies available");
            System.out.println("5. Change index number of course");
            System.out.println("6. Swap index number with another student");
            System.out.println("7. Logout");
            System.out.println("Enter your choice here: ");

            try {
                String dummy = sc.next();
                choice = Integer.parseInt(dummy);
            } catch (Exception e) {
                System.out.println("Input should be an integer!");
                continue;
            }

            switch (choice) {
                case 1:
                    scontrol.addCourse();
                    break;

                case 2:
                    scontrol.dropCourse();
                    break;

                case 3:
                    scontrol.printRegisteredCourses();
                    break;

                case 4:
                    scontrol.checkAvailableSlots();
                    break;

                case 5:
                    scontrol.changeIndex();
                    break;

                case 6:
                    scontrol.swapIndex();
                    break;

                case 7:
                    System.out.println("Logging out...");
                    scontrol.saveData();
                    break;
                default:
                    System.out.println("Invalid choice. Choices are between 1 to 7.");
            }
        } while (choice != 7);
    }
}
