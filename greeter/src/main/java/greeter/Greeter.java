package greeter;

public class Greeter {
    public static void main(String[] args) {
        final String output = Greetingformatter.greeting(args[0]);
        System.out.println(output);
    }
}
