package org.example.Model.Logger;

import java.io.FileWriter;

public class LoggerString implements ILogString {
    @Override
    public void update(String sign, String message) {
        try (FileWriter fw = new FileWriter("src/main/java/org/example/Log/Seminar_07_log.txt", true)) {
            fw.append(String.format("Log: %s {%s}\n", message, sign));
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}