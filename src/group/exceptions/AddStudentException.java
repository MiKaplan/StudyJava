package group.exceptions;

public class AddStudentException extends Exception {
    @Override
    public String getMessage(){
        return "Your group is full";
    }
}
