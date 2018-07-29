import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) {
                t2();

    }
    public static void t2(){
        File f = new File("F:/3.txt");
        File f1 = new File("F:/2.txt");

        try {
            FileReader fr = new FileReader(f1);
            FileWriter fw = new FileWriter(f);
            char []all = new char[(int)f1.length()];
            fr.read(all);

            for (char c :all){
                int d = c-444;
                if(d>='A'&&d<='z'){
                    fw.write(d);
                }else{
                    fw.write(c);
                }
                fw.flush();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void t1(){
        File f = new File("F:/1.txt");
        File f1 = new File("F:/2.txt");

        try {
            FileReader fr = new FileReader(f);
            FileWriter fw = new FileWriter(f1);
            char []all = new char[(int)f.length()];
            fr.read(all);


            for (char c :all){
                if(c=='9') {
                    c='0';
                    fw.write(c);
                }
                else if(c>='A'&&c<='z') {
                    fw.write(c + 444);
                }
                else {
                    fw.write(c);
                }
                fw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
