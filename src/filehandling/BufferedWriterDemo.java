package filehandling;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath="C:/Users/Vaibhav Nage/Desktop/Full Stack Java/Java/java full stack/src/filehandling/test1.txt";
        FileWriter fileWriter=new FileWriter(filePath);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("this is a test file");
        bufferedWriter.close();

        FileReader fileReader=new FileReader(filePath);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int n = bufferedReader.read();
        while (n>0){
            System.out.println((char)n);
            n=bufferedReader.read();
        }
        bufferedReader.close();
    }
}
