package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class StartClass {

    private BufferedReader reader;

    public StartClass() throws UnsupportedEncodingException {
        reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    }
    
    /**
     * метод enteredData - отвечает за вывод приглашения к вводу данных,
     * а также принятие данных введёных пользователем
     * 
     * @return - возвращает строку с введёнными данным пользователем
     * @throws IOException
     */
    public String enteredData() throws IOException {
    while (true) { 
        try {
            System.out.println(
                    "Введите следующие данные в произвольном порядке, разделенные пробелом: \n Фамилия Имя Отчество, дата рождения (дд.мм.гггг), номер телефона, пол (f или m)");
            System.out.println("Пример: Иванов Иван Иванович 12.12.2012 89997776655 m");
            String userEnteredData = reader.readLine();

            if (userEnteredData.isEmpty()) {
                throw new IllegalArgumentException("Введена пустая строка. Повторите ввод. \n");
            }
            return userEnteredData;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
}


