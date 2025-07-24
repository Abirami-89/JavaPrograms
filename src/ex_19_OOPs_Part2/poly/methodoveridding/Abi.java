package ex_19_OOPs_Part2.poly.methodoveridding;

public class Abi extends Father {
    @Override
    void home(){
        System.out.println("Abi - 3BHK");
    }

    void p1(){
        System.out.println("Abi - p1");
    }
}
