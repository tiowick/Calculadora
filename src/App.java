import java.util.Scanner;

class Calculator {
    double num1, num2;
    char operator;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.print("Escolha uma operação (+, -, *, /): ");
        operator = scanner.next().charAt(0);
    }

    double calculate() {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Erro! operador incorreto");
                return 0;
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Calculator calculator = new Calculator();
        calculator.input();
        double result = calculator.calculate();
        System.out.printf("%.1f %c %.1f = %.1f", calculator.num1, calculator.operator, calculator.num2, result);
    }
 

    
}
