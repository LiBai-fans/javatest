import java.io.*;

public class IOCopy {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rd = new RandomAccessFile("1.JPG","rw");
        RandomAccessFile wd = new RandomAccessFile("4.JPG","rw");


        for (int i=rd.read();i>-1;i=rd.read()){
            wd.write(i);
        }
        wd.close();
        rd.close();

    }
}
