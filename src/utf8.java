import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class utf8 {
    public static void main(String[] args) {

        File f = new File("F:/1.txt");
        System.out.println(Charset.defaultCharset());
        byte []b = new byte[(int)f.length()];
        try{
            InputStream in= new FileInputStream(f) ;
            in.read(b);
            System.out.println("从文件中读出来的数据是：");
            for(byte b1 :b){
                int i=b1&0x000000ff;
                System.out.print(Integer.toHexString(i)+" ");
            }
            System.out.println("\n"+"把这个数字放在utf-8棋盘上：");
            String str= new String(b,"utf-8");
            System.out.println(str);


        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
