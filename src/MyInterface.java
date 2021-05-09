@FunctionalInterface
public interface MyInterface {

    String myFunction(String s);

    public static MyInterface createMyInterface() {
        return (s) -> s + "Hello from interface";
    }


}
