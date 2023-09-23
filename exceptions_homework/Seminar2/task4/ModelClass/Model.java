package exceptions_homework.Seminar2.task4.ModelClass;

import java.util.Scanner;

public class Model {

    public String userStringEntering() {

        String userStr = "";
        boolean flag = false;
        while (!flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку:");
            userStr = sc.nextLine();
            if (!userStr.isEmpty()) {
                System.out.println("Введенная строка не пустая.");
                flag = true;
                return userStr;
            } else {
                System.out.println("Введенная строка пустая. \n Введите хоть, что ни будь. ");
            }
        }
        return userStr;
    }
}
