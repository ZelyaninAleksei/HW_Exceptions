package exceptions_homework.Seminar2.task1;

import exceptions_homework.Seminar2.task1.ModelClass.Model;

/**
 * Task #1
 * - Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

public class Main {
    public static void main(String[] args) {

        /**
         * Создание экземпляра класса Model;
         */
        Model mdl = new Model();

        /**
         * объявление переменной userNum и вызов метода класса Model
         */
        float userNum = mdl.fractionalNumberRequest();

        /**
         * вывод введённого пользователем числа
         */
        System.out.println("Введённое Вами число: \n" + userNum);
    }

}
