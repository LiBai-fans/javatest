import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class io4 {
    public static void main(String[] args) {

        try{
            InputStream in = new FileInputStream("s");
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
