package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadOnlyDemo {
    public static void main(String[] args)throws IOException {
        String filePath="C:/Users/Vaibhav Nage/Desktop/Full Stack Java/Java/java full stack/src/filehandling/readOnly.txt";
        File file=new File(filePath);
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Some important information");
        fileWriter.close();
        file.setReadOnly();
    }
}
