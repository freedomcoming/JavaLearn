
interface GreetingService {
    void sayMessage(String message);
}
public class lambdaUse {
    final static String salutation = "Hello! ";

    public static void main(String args[]) {
        GreetingService greetService = message ->
                System.out.println(salutation + message);
        greetService.sayMessage("Ru noob");
    }


}
