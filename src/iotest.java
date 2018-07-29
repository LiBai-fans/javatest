import java.io.File;

public class iotest
{
    public static void main(String[] args) {
        File file = new File("2.txt");

        if(file.exists()){
            System.out.println("文件存在");
        }else{
            try {
                file.createNewFile();
                System.out.println("文件不存在");
            }catch (Exception e){
                e.printStackTrace();
            }



        }
    }
}
