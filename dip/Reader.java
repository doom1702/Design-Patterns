package solid.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

interface Reader{
    public String read();
}

class FilesReader implements Reader {
    private String path;
    FilesReader(String path) {
    this.path =path;
    }

    public String read() {
        String aLine = " ";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            aLine = reader.readLine();

        } catch (Exception e) {
            System.out.println(e);

        }
        return aLine;
    }
}

class UrlReader implements Reader {
    private String url_path;

    UrlReader(String url_path) {
    this.url_path = url_path;
    }
        public String read() {
            URL url = null;
            try {
                url = new URL(url_path);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            InputStream in = null;
            try {
                in = url.openStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            InputStreamReader reader = new InputStreamReader(in);
            StringBuilder inputString1 = new StringBuilder();
            try {
                int c;
                c = reader.read();
                while (c != -1) {
                    inputString1.append((char) c);
                    c = reader.read();
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
            String inputString = inputString1.toString();

            return inputString;
        }
    }
