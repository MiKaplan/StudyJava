package group;

public class Main {
    public static void main(String[] args) {


        Group group = new Group();

        Student studentOne = new Student("Misha", "Kaplan", 21, true, true);
        Student studentTwo = new Student("Max", "Gritsenko", 21, true, true);
        Student studentThree = new Student("Alina", "Boyko", 24, false, true);
        Student studentFour = new Student("Dmitriy","Kamuz", 21, true, false);
        Student studentFive = new Student("Artem", "Artemov", 22, true, false);
        Student studentSix = new Student("Lubov", "Maistrenko", 22, false, true);
        Student studentSeven = new Student("Igor", "Voronin", 20, true, false);
        Student studentEight = new Student("Matvey", "Podbelskiy", 21, true, false);
        Student studentNine = new Student("Max", "Kosiak",22,true,false);
        Student studentTen = new Student("Vlad", "Necheporenko", 21, true, true);

        group.add(studentOne);
        group.add(studentTwo);
        group.add(studentThree);
        group.add(studentFour);
        group.add(studentFive);
        group.add(studentSix);
        group.add(studentSeven);
        group.add(studentEight);
        group.add(studentNine);
        group.add(studentTen);
        System.out.println();

        Student studentEleven = new Student("Bogdan", "Chubaka", 20, true, true);
        group.add(studentEleven);
        System.out.println();

        group.delete(studentEight);
        System.out.println();

        group.findStudent("Kaplan");
        System.out.println();

    }
}
