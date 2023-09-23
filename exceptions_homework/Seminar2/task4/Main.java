package exceptions_homework.Seminar2.task4;

import exceptions_homework.Seminar2.task4.ModelClass.Model;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        String userString = model.userStringEntering();

        System.out.println("Вы ввели: " + userString);
    }
    
}
