package oop.j_abstration.d_withInterface;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

interface URLProcessor {
    void process(URL url) throws IOException;
}

abstract class URLProcessorBase implements URLProcessor {
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

class URLProcessorImpl extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while (data != -1) {
            System.out.print((char) data);
            data = input.read();
        }
    }
}


public class withInterface {
    static void main() throws IOException {
        URLProcessorImpl processor = new URLProcessorImpl();
        processor.process(new URL("https://google.com/"));
    }
}
