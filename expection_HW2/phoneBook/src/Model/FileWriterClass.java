package Model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class FileWriterClass {

    public static void writeFile(String surName, ModelClass md) {
        String filename = surName + ".txt";
        Path path = Paths.get(filename);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = dateFormat.format(md.getDob());
        String text = md.getSurname() + " " + md.getName() + " " + md.getPatronymic() + " " + formattedDate + " " + md.getPhoneNumber() + " "
                + md.getGender();
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
                bw.write(text);
                bw.newLine();
                System.out.println("Данные успешно записаны в файл " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

