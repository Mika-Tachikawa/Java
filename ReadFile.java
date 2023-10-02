package test55;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("test.txta");
            BufferedReader reader = Files.newBufferedReader(p);
            String s = reader.lines().collect(Collectors.joining("\n"));
            System.out.println(s);
            reader.close();
        } catch (NoSuchFileException e) {
            System.out.println("ファイルが見つかりません:" + e.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}