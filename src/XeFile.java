import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XeFile {
    public  static  String sourceFile="data.csv";
    public static void writeToFile(List<Xe>xeList,String path) throws IOException{
        FileOutputStream writeDaTa=new FileOutputStream(path);
        ObjectOutputStream writeStream=new ObjectOutputStream(writeDaTa);
        writeStream.writeObject(xeList);
        writeStream.flush();
        writeStream.close();
    }
   public static List<Xe> readFromFile(String path)throws IOException,ClassNotFoundException{
       FileInputStream readDaTa=new FileInputStream(path);
       ObjectInputStream readStream=new ObjectInputStream(readDaTa);
       List<Xe>aaa=(ArrayList<Xe>) readStream.readObject();
       readStream.close();
       return aaa;
   }
}
