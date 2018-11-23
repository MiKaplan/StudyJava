package group;

import group.exceptions.AddStudentException;
import group.exceptions.DeleteStudentException;

import java.util.Arrays;

public class Group {
    Student student[] = new Student[10];

    public Group(Student[] student) {
        this.student = student;
    }

    public Group() {
        super();
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public void add(Student addStudent) {
        for (int i = 0; i < student.length; i++) {
            try {
                if (student[i] == null) {
                    student[i] = addStudent;
                    System.out.println("You are add new student: " + addStudent.toString());
                    break;
                }
                if (i == student.length - 1) {
                    throw new AddStudentException();
                }
            } catch (AddStudentException e){
                System.out.println(e.getMassage());
            }
        }
    }
    public void delete(Student delStudent){
        for (int i = 0; i <student.length ; i++) {
            try {
                if (student[i].equals(delStudent)){
                    student[i] = null;
                }
            if (student[i] == null) {
                throw new DeleteStudentException();
            }
            } catch (DeleteStudentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public Student findStudent(String surname) {

        Student st = null;
        for (int i = 0; i < student.length; i++) {

            if (student[i].getSurname().equals(surname)) {
                st = student[i];
                break;
            } else {
                System.out.println("This student is missing.");
            }


        }
        return st;
    }

    @Override
    public String toString() {
        return "Group{" +
                "student=" + Arrays.toString(student) +
                '}';
    }
}