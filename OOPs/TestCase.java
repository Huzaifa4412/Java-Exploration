class Test {
    static int x = 10;
    int y = 20;

    Test() {
        x++;
        y++;
    }

    void show() {
        System.out.println(x + " " + y);
    }
}

public class TestCase {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.show();
        t2.show();
    }
}