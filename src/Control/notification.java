package Control;

import Entity.CourseRegistration;
import Entity.Student;

/**
 * This is an interface class for notifications
 */
public interface notification {
    /**
     * This abstract method will be implemented by concrete classes to send notifications
     * @param S The student
     * @param C The course registered
     */
    public void sendnotification(Student S, CourseRegistration C);
}
