package test55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WebClient {

    public static void main(String[] args) throws IOException {
        String domain = "example.com";
        Socket socket = null;
        PrintWriter pw = null;
        InputStreamReader isr = null;
        BufferedReader bur = null;

        try {
            socket = new Socket(domain, 80);
            pw = new PrintWriter(socket.getOutputStream());
            isr = new InputStreamReader(socket.getInputStream());
            bur = new BufferedReader(isr);

            pw.println("GET /index.html HTTP/1.1");
            pw.println("Host: " + domain);
            pw.println();
            pw.flush();

            bur.lines()
                    .limit(18)
                    .forEach(System.out::println);
        } finally {
            if (bur != null) {
                bur.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (pw != null) {
                pw.close();
            }
            if (socket != null) {
                socket.close();
            }
        }
    }

}