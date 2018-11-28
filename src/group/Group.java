package group;

import group.exceptions.AddStudentException;

import javax.swing.*;
import java.util.ArrayList;


public class Group implements Voenkom {
   private Student student[] = new Student[10];

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

    public void addStudentInteractive() throws AddStudentException {
        try {
            String name = getName("Input student name");
            String lastName = getName("Input student lastname");
            int age = getAge("Input student age");
            boolean sex = getSex("Input sex -> man or women");
            boolean contract = getContract("Input contract -> contract or budget");
            Student st = new Student(name, lastName, age, sex, contract);
            this.add(st);
        } catch (NullPointerException e) {
            System.out.println("Canceled");
            return;
        }
        System.lineSeparator();

    }

    private int getAge(String message) throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done; ) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return age;
    }

    private String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message).equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getContract(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message).equals("contract");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    public void add(Student addStudent) throws AddStudentException {
        if (addStudent == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < student.length; i++) {

            if (student[i] == null) {
                student[i] = addStudent;
                System.out.println("You are add new student: " + addStudent.toString());
                return;
            }
        }
        throw new AddStudentException();
    }

    public void deleteStudent(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("You didn't choose the student");
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null && student[i].getSurname() == surname) {
                student[i] = null;
                System.out.println("You are delete " + surname);
            }
        }
    }

    public Student findStudent(String surname) {
        for (Student st : student) {
            if (st != null && st.getSurname().compareToIgnoreCase(surname) == 0) {
                System.out.println("Your student is find: ");
                return st;
            }
        }
        return null;
    }

    private void sort() {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (compareStudent(student[i], student[j]) > 0) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return -1;
        }
        if (a == null && b != null) {
            return 1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getSurname().compareTo(b.getSurname());
    }

//    @Override
//    public Student[] soldiers() {
//        int size = 0;
//        for (int i = 0; i < student.length; i++) {
//            if (student[i] != null && student[i].getAge() >= 18 && student[i].isSex()) {
//                size++;
//            }
//        }
//        Student[] soldiers = new Student[size];
//        for (int i = 0; i < student.length; i++) {
//            for (int j = 0; j < soldiers.length; j++) {
//                if (student[i] != null && student[i].getAge() >= 18 && student[i].isSex()) {
//                    student[i] = soldiers[j];
//                }
//            }
//        }
//        return soldiers;
//    }

    @Override
    public ArrayList<Student> soldiers() {
        ArrayList <Student> solider = new ArrayList<>();
        for (int i = 0; i < student.length ; i++) {
            if (student[i] != null && student[i].getAge() >= 18 && student[i].isSex()){
                solider.add(student[i]);
            }
        }
        System.out.println();
        System.out.println("Students who will go to the army:");
        return solider;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        sort();
        for (Student st : student) {
            if (st != null){
                builder.append(System.lineSeparator()).append(++i + ") ").append(st);
                builder.append(System.lineSeparator());
            }
        }
       return builder.toString();
    }

}