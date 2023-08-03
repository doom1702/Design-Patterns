package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        String file_path = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        EncodingModule fileEncodingModule  = new EncodingModule();
        fileEncodingModule.read_encode_write(new FilesReader(file_path),new FilesWriter(file_path));

        String url_path = "http://myfirstappwith.appspot.com/index.html";
        EncodingModule urlEncodingModule  = new EncodingModule();
        urlEncodingModule.read_encode_write(new FilesReader(url_path),new DatabaseWriter());


    }
}
