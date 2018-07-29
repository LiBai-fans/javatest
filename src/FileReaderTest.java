import com.sun.deploy.util.SyncFileAccess;

import java.io.*;
import java.nio.charset.Charset;

public class FileReaderTest {

    public static void main(String[] args) {

    }
    public static void t1(){

    }
    public static void t(){
        File f = new File("F:/1.txt");
        System.out.println(Charset.defaultCharset());
        char all[] = new char[(int)f.length()];

        try {
            FileReader fr = new FileReader(f);
            InputStreamReader inR = new InputStreamReader(new FileInputStream(f),Charset.forName("Unicode"));
            inR.read(all);
            System.out.println(new String(all));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
