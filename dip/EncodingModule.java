package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 *
 */

public class EncodingModule {
    public void read_encode_write(Reader reader,Writer writer){

        String aLine = reader.read();
        String encodedLine = Base64.encodeBytes(aLine.getBytes());
        writer.toWrite(encodedLine);


    }
//    public void encodeWithFiles() {
//        String input_path = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
//        String output_path = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
//        Reader reader =new Reader();
//        Writer writer = new Writer();
//        String aLine;
//        try {
//            aLine = reader.readFile(input_path);
//            String encodedLine = Base64.encodeBytes(aLine.getBytes());
//            writer.toFile(output_path,encodedLine);
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//    public void encodeBasedOnNetworkAndDatabase() {
//        String method ="http";
//        String link = "myfirstappwith.appspot.com";
//        String page =  "index.html";
//        Reader reader =new Reader();
//        Writer writer = new Writer();
//        try{
//            String inputString = reader.readUrl(method,link,page);
//            String encodedString = Base64.encodeBytes(inputString.getBytes());
//            writer.toDatabase(encodedString);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//    }
}

