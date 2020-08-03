public class HelloWorld {

    public String sayHi() {
        return "HelloWORLD";
    }

    public String sayHi(String input) {
        String cap = input.substring(0, 1).toUpperCase() + input.substring(1);
        return "Hello " + cap;
    }
}
