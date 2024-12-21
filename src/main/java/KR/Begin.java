package KR;

/*
Написать класс Калькулятор (необобщенный),
который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Begin{
    static double numberOfCase = 0;
    static boolean trust = true;

    public static void begin(Scanner scan) {
        double num1 = 0, num2 = 0;
        while (trust) {
            switch ((int) numberOfCase) {
                case 0:
                    System.out.println("\n    <<<--- Welcome to my calculator! --->>>"+
                            "              Input Your action" +
                            "\nnumber 1(one) - sum\n" +
                            "number 2(two) - multiply\n" +
                            "number 3(three) - divide/\n" +
                            "number 4(four) - subtract\n" +
                            "number 5(five) - exit from calculator\n" +
                            "number 0(null) - menu");
                    System.out.print("Input number - ");
                    double input = scan.nextDouble();
                    if (input < 0 || input > 5) {
                        System.out.println("Incorrect!");
                        numberOfCase = 0;
                    } else {
                        numberOfCase = input;
                    }
                    break;
                case 1:
                    System.out.println("\nВведи первое число");
                    try {
                        num1 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }

                    System.out.println("Введи второе число");
                    try {
                        num2 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);

                    }

                    System.out.printf("--->>> Result: " + Calc.sum(num1, num2)+" <<<---\n");
                    System.out.println("\nnumber 1(one) - sum\n" +
                            "number 2(two) - multiply\n" +
                            "number 3(three) - divide/\n" +
                            "number 4(four) - subtract\n" +
                            "number 5(five) - exit from calculator\n" +
                            "number 0(null) - menu");
                    System.out.print("Input number - ");
                    input = scan.nextDouble();
                    if (input < 0 || input > 5) {
                        System.out.println("Incorrect!");
                        numberOfCase = 0;
                    } else {
                        numberOfCase = input;
                    }
                    break;
                case 2:
                    System.out.println("\nВведи первое число");
                    try {
                        num1 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.println("Введи второе число");
                    try {
                        num2 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.printf("--->>> Result: " + Calc.multiply(num1, num2)+" <<<---\n");
                    System.out.println("\nnumber 1(one) - sum\n" +
                            "number 2(two) - multiply\n" +
                            "number 3(three) - divide/\n" +
                            "number 4(four) - subtract\n" +
                            "number 5(five) - exit from calculator\n" +
                            "number 0(null) - menu");
                    System.out.print("Input number - ");
                    input = scan.nextDouble();
                    if (input < 0 || input > 5) {
                        System.out.println("Incorrect!");
                        numberOfCase = 0;
                    } else {
                        numberOfCase = input;
                    }
                    break;
                case 3:
                    System.out.println("\nВведи первое число");
                    try {
                        num1 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.println("Введи второе число");
                    try {
                        num2 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.printf("--->>> Result: " + Calc.divide(num1, num2)+" <<<---\n");
                    System.out.println("\nnumber 1(one) - sum\n" +
                            "number 2(two) - multiply\n" +
                            "number 3(three) - divide/\n" +
                            "number 4(four) - subtract\n" +
                            "number 5(five) - exit from calculator\n" +
                            "number 0(null) - menu");
                    System.out.print("Input number - ");
                    input = scan.nextDouble();
                    if (input < 0 || input > 5) {
                        System.out.println("Incorrect!");
                        numberOfCase = 0;
                    } else {
                        numberOfCase = (int) input;
                    }
                    break;
                case 4:
                    System.out.println("\nВведи первое число");
                    try {
                        num1 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.println("Введи второе число");
                    try {
                        num2 = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Похоже была введена точка, " +
                                "а не запятая между цифр" + e);
                    }
                    System.out.printf("--->>> Result: " + Calc.subtract(num1,num2)+" <<<---\n");
                    System.out.println("\nnumber 1(one) - sum\n" +
                            "number 2(two) - multiply\n" +
                            "number 3(three) - divide/\n" +
                            "number 4(four) - subtract\n" +
                            "number 5(five) - exit from calculator\n" +
                            "number 0(null) - menu");
                    System.out.print("Input number - ");
                    input = scan.nextDouble();
                    if (input < 0 || input > 5) {
                        System.out.println("Incorrect!");
                        numberOfCase = 0;
                    } else {
                        numberOfCase = input;
                    }
                    break;
                case 5:
                    System.out.println("Exit from calculator");
                    trust = false;
                    scan.close();
                    break;
                default:
                    System.out.println("Something went wrong.");
                    numberOfCase = 0;
            }
        }
    }

}
