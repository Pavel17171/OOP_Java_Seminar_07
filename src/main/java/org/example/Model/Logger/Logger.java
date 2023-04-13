package org.example.Model.Logger;

import org.example.Model.ComplexNumber;

import java.io.FileWriter;

public class Logger implements ILog {
    @Override
    public void update(ComplexNumber number, String message) {
        try (FileWriter fw = new FileWriter("src/main/java/org/example/Log/Seminar_07_log.txt", true)) {
            fw.append(String.format("Log: %s {%s}\n", message, number.toString()));
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}