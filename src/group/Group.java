package group;

import group.exceptions.AddStudentException;


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

    public void add(Student addStudent) throws AddStudentException{
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

    public void deleteStudent(String surname)  {
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

//public boolean deleteStudent(String surname) {
//    for (int i = 0; i < student.length; i++) {
//        if (student[i] != null && student[i].getSurname() == surname) {
//            student[i] = null;
//            return true;
//        }
//    }
//    return false;
//    }
    public Student findStudent(String surname) {
        for (Student st : student) {
            if (st != null && st.getSurname().compareToIgnoreCase(surname) == 0){
                System.out.println("Your student is find: ");
                return st;
            }
        }
        return null;
    }
    private void sort(){
        for (int i = 0; i < student.length-1 ; i++) {
            for (int j = i+1; j < student.length; j++) {
                if (compareStudent(student[i], student[j]) > 0){
                    Student temp = student [i];
                    student [i] = student [j];
                    student [j] = temp;
                }
            }
        }
    }
    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getSurname().compareTo(b.getSurname());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
//        sb.append("Group: " + "\n" + student).append(System.lineSeparator());
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