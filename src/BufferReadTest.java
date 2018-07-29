import java.io.*;

public class BufferReadTest {

    public static void main(String[] args) throws IOException {
        File f = new File("D:\\data\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("5.txt"));
        BufferedWriter bt = new BufferedWriter(new FileWriter("D:\\data\\text.txt"));
                    
        if (f.exists()){
            System.out.println("存在");
        }else
        {
            System.out.println("不存在");
            f.createNewFile();
        }
        for (int i= br.read();i>-1;i=br.read()){
            bw.write(i);
            bt.write(i);
        }
        bt.close();
        bw.close();
        br.close();
    }
}
