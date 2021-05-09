public class PassByValue {

    public static void main(String[] args)
    {
        int x = 5;

        change(x);

        System.out.println(x);
    }

    public static int change(int x)
    {
        x = 10;
        return x;
    }
}