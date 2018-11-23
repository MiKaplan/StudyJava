package group.exceptions;

public class AddStudentException extends Exception {

    public String getMassage(){
        return "Your group is full";
    }
}
