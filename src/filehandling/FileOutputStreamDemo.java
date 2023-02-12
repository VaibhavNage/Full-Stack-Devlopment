package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String filePath="C:/Users/Vaibhav Nage/Desktop/Full Stack Java/Java/java full stack/src/filehandling/welcome.txt";
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            String msg="welcome to java world";
            byte[] arr=msg.getBytes();
            fos.write(arr);
            fos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            FileInputStream fis=new FileInputStream(filePath);
            int n=fis.read();
            while (n>0){
                System.out.println((char)n);
                n=fis.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
