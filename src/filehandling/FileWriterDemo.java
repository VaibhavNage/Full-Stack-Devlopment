package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String fileName="C:/Users/Vaibhav Nage/Desktop/Full Stack Java/Java/java full stack/src/filehandling/demo1.txt";
        try {
            FileWriter fileWriter=new FileWriter(fileName);
            fileWriter.write("Hello");
            fileWriter.write("\nWelcome to the Java World");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        FileReader fileReader=null;
        try {
            fileReader=new FileReader(fileName);
            int n = fileReader.read();
            while (n>0){
                System.out.print((char)n);
                n=fileReader.read();
            }
            System.out.println();
        }catch (FileNotFoundException e ){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
