public class OperatorPractice {

    static String j = "my string";

    public static void main(String[] args){

        System.out.println(j);
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;
        b++;
        //++a;

        System.out.print(a+" "+ b +" " + c);
    }
}
