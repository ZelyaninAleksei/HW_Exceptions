package Controller;

import java.io.UnsupportedEncodingException;

import View.StartClass;

public class ControllerUserData {

    public String[] checkUserData() throws UnsupportedEncodingException {
        StartClass start = new StartClass();
        while (true) {
            try {
                String userString = start.enteredData();
                String[] inputArray = userString.split(" ");

                if (inputArray.length != 6) {
                    if (inputArray.length == 1) {
                        throw new Exception("Вы ввели " + inputArray.length + " параметр, ожидалось 6. \n Повторите ввод.");
                    } else if (inputArray.length > 1 && inputArray.length < 5) {
                        throw new Exception("Вы ввели " + inputArray.length + " параметра, ожидалось 6. \n Повторите ввод.");
                    } else if (inputArray.length > 6) {
                        throw new Exception("Вы ввели " + inputArray.length + " параметров, ожидалось 6. \n Повторите ввод.");
                    }
                } else {
                    return inputArray;
                }
            }

            catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
