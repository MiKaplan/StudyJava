package group.exceptions;

public class DeleteStudentException extends Exception {

    public String getMessage(){
        return "This student has already been deleted";
    }
}
