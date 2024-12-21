package KR;

/*
Написать класс Калькулятор (необобщенный),
который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */

public class Calc {

    protected static <T extends Double> double sum(T t1, T t2){
        double res = t1.doubleValue() + t2.doubleValue();
        return res;
    }

    protected static <T extends Double> double multiply(T t1, T t2){
        double res = t1.doubleValue() * t2.doubleValue();
        return res;

    }

    protected static <T extends Double> double divide(T t1, T t2){
        double res = t1.doubleValue() / t2.doubleValue();
        return res;
    }

    protected static < T extends Double> double subtract(T t1, T t2){
        double res = t1.doubleValue() - t2.doubleValue();
        return res;
    }
}
