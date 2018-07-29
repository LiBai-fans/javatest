import java.io.IOException;
import java.io.PipedInputStream;

public class t2  extends Thread{
    PipedInputStream p;

    public t2(PipedInputStream p){
        this.p=p;
    }
    @Override
    public void run() {
        try {
            for(int i=p.read();i>-1;i=p.read()){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                p.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
