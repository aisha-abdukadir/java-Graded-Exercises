package Exercises;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[100];
        numberOfStudents = 0;
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Add a student
    public void addStudent(String student) {
        // If array is full, create a larger array
        if (numberOfStudents >= students.length) {
            String[] newStudents =
                    new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop a student
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Shift remaining students to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }

    // Get students
    public String[] getStudents() {
        return students;
    }

    // Get number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {

        Course course = new Course("Java");

        course.addStudent("Aisha");
        course.addStudent("Ahmed");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of Students: "
                + course.getNumberOfStudents());
    }
}

