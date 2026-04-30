class Test {
    int x = 10;

    static void show() {
        System.err.println(x);
    }
}

public class CommanMistakes {
    public static void main(String[] args) {
        Test.show();
    }
}
