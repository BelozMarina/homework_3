public class Homework_3 {
    public static void main(String[] args) {
        int a = 21;
        int b = 4;
        int c = 10;
        int d = 6;

        System.out.println("Task #1: ");

        if (a < b && a < d && a < c) {
            System.out.println("The value " + a + " is less");
        } else if (b < a && b < c && b < d) {
            System.out.println("The value " + b + " is less");
        } else if (c < a && c < b && c < d) {
            System.out.println("The value " + c + " is less");
        } else if (d < a && d < b && d < c) {
            System.out.println("The value " + d + " is less");
        } else {
            System.out.println("Not the value less");
        }


        System.out.println();
        System.out.println("Task #2: ");

        int x = 12;
        int y = 1;
        int z = 1;
        int k = 20;

        int count = 0;

        if (x == y || x == z || x == k || y == z || y == k || z == k) {
            if (x == y) {
                count++;
            }
            if (x == z) {
                count++;
            }
            if (x == k) {
                count++;
            }
            if (x == x) {
                count++;
                System.out.println("Number of same values = " + count);
            } else {
                System.out.println("The set does not have the same values");
            }
        }


        System.out.println();
        System.out.println("Task #3");

        int f = 12;
        int e = 35;

        System.out.println("Summation = " + setSum(f, e));
        System.out.println("Denial = " + setDen(f, e));
        System.out.println("Multiplication = " + setMul(f, e));
        System.out.println("Division = " + setDiv(e, f));


    }

    static int setSum(int a, int b) {
        return a + b;
    }

    static int setDen(int a, int b) {
        return a - b;
    }

    static int setMul(int a, int b) {
        return a * b;
    }

    static int setDiv(int a, int b) {
        return a / b;
    }
}
