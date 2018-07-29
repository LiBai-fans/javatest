import java.io.*;

/*
       把一个大于100KB的文件平均分成100KB的文件
 */

/*
        把之前分解的文件合并
 */
public class Disintegrate  {


    public static void main(String[] args) throws IOException{
        merge();

    }
    public static void  merge(){
        File merge = new File("F:/test/1.mp4");
        InputStream in=null;
        OutputStream ou=null;
        int i=0;
        byte []b = new byte[16777216];
        try {
            ou=new FileOutputStream(merge);
            while(i!=14){
                File f = new File("F:/test/1-"+i+".mp4");
                in = new FileInputStream(f);
                in.read(b);
                ou.write(b);
//                ou.flush();
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (ou!=null)
                    ou.close();
                if (in!=null)
                    in.close();
            }catch (IOException e){
                e.printStackTrace();
            }

            System.out.println("合并完成");
        }
    }

    public static void disintegrate(){
        File f = new File("F:/4.mp4");

        byte []b = new byte[16777216];
        File fm = new File("F:/test");
        fm.mkdir();

        InputStream in = null;
        OutputStream ou = null;

        int i=0;
        try {
            in =  new FileInputStream(f);

            int c =in.read(b);
            while (c!=-1){
                File file = new File("F:/test/1-"+i+".mp4","");
                file.canExecute();
                ou = new FileOutputStream(file);
                ou.write(b);
                c=in.read(b);
                ou.flush();
                i++;
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }finally {
            try{
                if (in!=null)
                    in.close();
                if (ou!=null)
                    ou.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
