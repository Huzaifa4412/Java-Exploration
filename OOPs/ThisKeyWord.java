class Test {
    static int a = 10;

    void add(int a) {
        System.err.println(this.a += a);
    }
}

public class ThisKeyWord {

    public static void main(String[] args) {
        // Test aTest = new Test();
        // aTest.add(20);
        // System.err.println(aTest.a);
        
    }
}
