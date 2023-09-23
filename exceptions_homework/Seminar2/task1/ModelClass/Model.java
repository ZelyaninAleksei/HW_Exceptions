package exceptions_homework.Seminar2.task1.ModelClass;

import java.util.Scanner;

/**
 * - Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

public class Model {

    /**
     * Метод fractionalNumberRequest() отвечат за приглашение ввода пользователем
     * числа, и производит валидацию веденных данных, в случае ввода букв просит
     * повторно произвести ввод
     * 
     * @return - возвращает введённое пользователем дробное число (тип float)
     */
    public float fractionalNumberRequest() {
        float userNumber = 0.0f;

        boolean validInput = false;
        while (!validInput) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите дробноe числа (типа float) : ");
                userNumber = sc.nextFloat();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: Введено некорректное значение. Попробуйте еще раз.");
            }
        }

        return userNumber;
    }
}
