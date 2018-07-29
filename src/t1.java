import java.io.IOException;
import java.io.PipedOutputStream;

public class t1 extends  Thread {

   private   PipedOutputStream p ;
   private  String s ;
   public t1(PipedOutputStream p,String s){
        this.p=p;
        this.s=s;
    }
    @Override
    public void run() {
       try {
           p.write(s.getBytes());
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
