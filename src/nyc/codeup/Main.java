package nyc.codeup;

public class Main {

    public static void main(String[] args) {
        Main.setup("Iterative:");
        Main.iterativeFibonacci();
        System.out.println("------------");
        Main.setup("Recursive");
        Main.recursiveFibonacci(0, 1, 1);
    }

    private static void setup(String title) {
        System.out.println(title);
        System.out.println(0);
        System.out.println(1);
    }

    private static void iterativeFibonacci() {
        int count;
        int temp;
        int termOne = 0;
        int termTwo = 1;

        for (count = 0; count <= 10; count++) {
            temp = termTwo;
            termTwo = termOne + termTwo;
            System.out.println(termTwo);
            termOne = temp;
        }
    }

    private static void recursiveFibonacci(int termOne, int termTwo, int count) {
        System.out.println(termOne + termTwo);
        if (count <= 10) {
            Main.recursiveFibonacci(termTwo, termOne + termTwo, count + 1);
        }
    }
}
