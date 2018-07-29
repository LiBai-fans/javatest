import java.io.File;

public class io3 {
    public static void main(String[] args) {
        File f = new File("F:");
        String s[] = f.list();
        for (String s1:s) {
            File f2 = new File(f.getPath()+"//"+s1);
            System.out.println(s1);
            if(!f2.isFile()) {
                String s2[] = f2.list();
                for (String s3 : s2) {
                    System.out.println("   " + s3);
                }
            }
        }
    }
}
