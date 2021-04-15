package annotation;

public class BusinessLogic {
    public BusinessLogic() {
        super();
    }


    @ToDo(priority = ToDo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    }

    @ToDo(priority = ToDo.Priority.MEDIUM, author = "Uday", status = ToDo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    }

    @ToDo(priority = ToDo.Priority.LOW, status = ToDo.Status.STARTED)
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    }
}