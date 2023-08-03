package solid.live.dip;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

interface Writer{
    public void toWrite(String encodedLine);
}
class FilesWriter implements Writer {
    private String path;
    FilesWriter(String path){
        this.path = path;
    }
    public void toWrite(String encodedLine) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(encodedLine);
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        }


}
class DatabaseWriter implements Writer{
    MyDatabase database = new MyDatabase();

    @Override
    public void toWrite(String encodedLine) {
        database.write(encodedLine);

    }
}
