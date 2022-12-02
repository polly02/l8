public class CustomMath {
    public static int sum(int x, int y) {
        return x+y;
    }

    public static int division(int x, int y) {
        return x/y;
    }

    public static void main(String[] args) {
        if (sum(1, 3) == 4) {
            System.out.println("Test1 passed");
        } else {
            System.out.println("Test1 failed");
        }
        try {
            int z = division(4, 2);
            System.out.println("Test3 passed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test3 failed");
        }
    }
}
