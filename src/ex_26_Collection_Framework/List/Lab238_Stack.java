package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        // Stack
        // List In -> First Out
//        Stack s = new Stack();
//        s.add("Abi");
//        s.add("Rami");
//        System.out.println(s);


        Stack s = new Stack();
        s.push("Abi");
        s.push("Rami");
        s.push("Krish");
        s.push("Krish2");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Dev"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);


        System.out.println(s.get(0));
        System.out.println(s.get(1));








    }
}
