package calculator.commands;
import calculator.Constants;

public class Exit {

    public static void execute() {
        System.out.println(Constants.GOODBYE_MESSAGE);
        System.exit(0);
    }
}
