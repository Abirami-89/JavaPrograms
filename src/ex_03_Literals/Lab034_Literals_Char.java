package ex_03_Literals;

public class Lab034_Literals_Char {
    public static void main(String[] args) {


        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("Abirami");
//        System.out.println("Abi" + new_line + "rami");
//        System.out.println("Abi" + tab_line +  "rami");
//        System.out.println("Abi+ back_space +  "rami");
        System.out.println("Abi" + carriage_return + "rami");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        System.out.println("Abi has "+ruppes+10);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11  = '\u1F60';


    }
}
