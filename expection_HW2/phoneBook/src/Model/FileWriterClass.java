package Model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class FileWriterClass {

    public static void writeFile(String surName, ModelClass md) {
        String filename = surName + ".txt";
        Path path = Paths.get(filename);
        String text = md.getSurname() + " " + md.getName() + " " + md.getPatronymic() + " " + md.getDob() + " " + md.getPhoneNumber() + " "
                + md.getGender() + "\n";
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
                bw.write(text);
                bw.newLine(); // Добавляем пустую строку для разделения записей, если нужно.
                System.out.println("Данные успешно записаны в файл " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

