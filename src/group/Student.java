package group;


public class Student extends Human {
private boolean contract;

    public Student(String name, String surname, int age, boolean sex, boolean contract) {
        super(name, surname, age, sex);
        this.contract = contract;
    }



    public Student(String name, String surname, int age, boolean sex) {
        super(name, surname, age, sex);

    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "contract=" + contract;
    }
}
