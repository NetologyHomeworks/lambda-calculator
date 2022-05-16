package ru.netology.lambda.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //В результате математических операций a: 1 + 2 = 3 и b: 1 - 1 = 0
        //соответственно c: 3 / 0 - здесь возникает ошибка, т.к. на ноль делить нельзя.
        //Для решения этой проблемы были внесены измененния в бинарном операторе divide
        //в классе Calculator (добавлена проверка через тернарное выражение)
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }
}
