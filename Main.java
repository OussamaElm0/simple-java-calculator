import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation sign (+,-,*,/): ");
        char op = sc.next().charAt(0);

        boolean areBothIntegers = (a == (int) a) && (b == (int) b);

        switch (op) {
            case '+':
                add(a, b, areBothIntegers);
                break;
            case '-':
                subtract(a, b, areBothIntegers);
                break;
            case '*':
                multiply(a, b, areBothIntegers);
                break;
            case '/':
                divide(a, b, areBothIntegers);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    static void add(double a, double b, boolean areBothIntegers) {
        if (areBothIntegers) {
            System.out.println((int) a + (int) b);
        } else {
            System.out.println(a + b);
        }
    }

    static void subtract(double a, double b, boolean areBothIntegers) {
        if (areBothIntegers) {
            System.out.println((int) a - (int) b);
        } else {
            System.out.println(a - b);
        }
    }

    static void multiply(double a, double b, boolean areBothIntegers) {
        if (areBothIntegers) {
            System.out.println((int) a * (int) b);
        } else {
            System.out.println(a * b);
        }
    }

    static void divide(double a, double b, boolean areBothIntegers) {
        if (areBothIntegers && b != 0) {
            System.out.println((int) a / (int) b);
        } else if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}