package ru.netology.calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        /* в операции minus происходит вычетание 1 минус 1, в результате получаентся 0,
        и результат присваивается  переменной "b", далее идет вычисление переменной "с",
        т.е. "a" делим на "b", и получаем ошибку "деление на 0". в таких случаях лучше
        использовать тернарные операторы для проверки переменных на равенство 0, либо условия
        проверки на 0, либо такие операции делать через обработки ошибок.
         */
        calc.println.accept(c);
    }
}
