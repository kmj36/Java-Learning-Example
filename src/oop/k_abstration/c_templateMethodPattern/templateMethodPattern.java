package oop.k_abstration.c_templateMethodPattern;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

abstract class URLProcesseorBase {
    public void process(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();
        try {
            processURLData(input);
        } finally {
            input.close();
        }
    }

    protected abstract void processURLData(InputStream input) throws IOException;
}

class URLProcessorImpl extends URLProcesseorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while (data != -1) {
            System.out.print((char) data);
            data = input.read();
        }
    }
}

public class templateMethodPattern {
    static void main() throws IOException {
        URL url = new URL("https://google.com/");
        URLProcessorImpl processor = new URLProcessorImpl();
        processor.process(url);
    }
}
