import java.io.File;

public class iotest2 {
    public static void main(String[] args) {
        File file = new File("3.txt");
        File file2 = new File("D4r");
        File file3 = new File("Top4/44");
        File file4 = new File("test.txt");
        File file5 = new File("11.txt");
        try {
            file.renameTo(file4);
            file5.createNewFile();
            file2.mkdir();
            file3.mkdir();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
