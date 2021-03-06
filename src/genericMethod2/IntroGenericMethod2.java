package genericMethod2;

class AAA {
    public String toString() {
        return "Class - genericMethod2.AAA";
    }
}

class BBB {
    public String toString() {
        return "Class - genericMethod2.BBB";
    }
}

class InstanceTypeShower2 {
    public <T, U> void showInstType(T inst1, U inst2) {
        System.out.println(inst1);
        System.out.println(inst2);
    }
}


public class IntroGenericMethod2 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        InstanceTypeShower2 shower = new InstanceTypeShower2();
        shower.showInstType(aaa,bbb);
    }
}
