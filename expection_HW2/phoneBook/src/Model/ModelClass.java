package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelClass {
    String surname;
    String name;
    String patronymic;
    Date dob;
    long phoneNumber;
    char gender;

    public ModelClass() {
    }

    public ModelClass parsingData(String[] dataArray) {
        boolean successfulParsing = false;
        for (String string : dataArray) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date date = dateFormat.parse(string);
                this.dob = date;
                successfulParsing = true;
            } catch (ParseException e) {

            }

            try {
                char gender = string.charAt(0);
                this.gender = gender;
                successfulParsing = true;
            } catch (IndexOutOfBoundsException e) {

            }

            try {
                long phoneNumber = Long.parseLong(string);
                this.phoneNumber = phoneNumber;
                successfulParsing = true;
            } catch (NumberFormatException e) {

            }
            if (this.surname == null || this.surname.isEmpty()) {
                this.surname = string;
            } else if (this.name == null || this.name.isEmpty()) {
                this.name = string;
            } else if (this.patronymic == null || this.patronymic.isEmpty()) {
                this.patronymic = string;
            }
            }
        
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = dateFormat.format(getDob());
        return "Фамилия: " + getSurname() + " Имя: " + getName() + " Отчество: " + getPatronymic()
                + "\n Дата рождения:  " + formattedDate + " \n Пол: " + getGender() + "\n Номер телефона: "
                + getPhoneNumber();
    }

}