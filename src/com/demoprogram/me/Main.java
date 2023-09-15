package com.demoprogram.me;

public class Main {

        public static void main(String[] args) {
        System.out.println(mathFunction(1, 2, 3));
        System.out.println(mathFunction(4, 5, -1));
        System.out.println(mathFunction(3, 3, 9));
        System.out.println(mathFunction(2, 2, 0));
        System.out.println(mathFunction(3, 3, 1));
        System.out.println(mathFunction(8,6,60));
        System.out.println(mathFunction(9, 0, 12));
    }

//    the function simply check if the result which is number3 eaqual to number1 operator number2 pick the right operator
//      it can be implement by switch statement too
    public static String mathFunction(int number1, int number2, int number3) {
        if (number1 + number2 == number3) {
            return "+";
        }
        if (number1 - number2 == number3) {
            return "-";
        }
        if (number1 * number2 == number3) {
            return "*";
        }
//        first check for division to avoid for division to zero
        if (number2 != 0 && number1 / number2 == number3) {
            return "/";
        }
        return "None";
    }
}


