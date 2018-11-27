package group;

import group.exceptions.AddStudentException;

public class Main {
    public static void main(String[] args) throws AddStudentException{


        Group group = new Group();

    group.add(new Student("Misha", "Kaplan", 21, true, true));
    group.add(new Student("Max", "Gritsenko", 21, true, true));
    group.add(new Student("Alina", "Boyko", 24, false, true));
    group.add(new Student("Matvey", "Podbelskiy", 21, true, false));
    group.add(new Student("Max", "Kosiak",22,true,false));
        System.out.println(group);

        group.deleteStudent("Kaplan");
        System.out.println(group);


        System.out.println(group.findStudent("Boyko"));



    }
}
