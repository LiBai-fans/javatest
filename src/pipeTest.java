import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipeTest {


    public static void main(String[] args) throws IOException {
         PipedOutputStream ou = new PipedOutputStream();

        PipedInputStream in = new PipedInputStream(ou);
        Thread t1= new t1(ou,"hello my test");
        Thread t2=new t2(in);
        t1.start();
        t2.start();
    }
}
