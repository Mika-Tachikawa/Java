package test55;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    String message = "test\nmessage\n";
    Path p = Paths.get("test.txt");
    Files.write(p, message.getBytes());
  }
}