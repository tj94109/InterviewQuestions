import javax.xml.soap.Text;

public class UserInput {

    public static class TextInput {

        String s = "";

        void add(char c){
               String m = Character.toString(c);
            s += m;
        }

        String getValue(){
            return s;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        void add(char c){
            if (Character.isDigit(c)){
                String m = Character.toString(c);
                s += m;
            };
        }
    }

    public static void main(String[] args) {


        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}

