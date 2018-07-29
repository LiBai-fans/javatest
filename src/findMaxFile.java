import java.io.File;

public class findMaxFile {
/*
    遍历一个目录，找出最大的文件和最小的文件
 */

    public static void main(String[] args) {
        File f = new File("D:/");
        String s[] = f.list();
        File []fs =f.listFiles();
        File maxF=fs[0] ;
        File minF=fs[0];
        int i=0;
        while(i<fs.length&&minF.length()==0.0){
            minF=fs[i];
            i++;
        }
        System.out.println(minF.length());
        for( i=0;i<fs.length;i++){
            if (fs[i].length()>maxF.length()){
                maxF=fs[i];
            }
            if (fs[i].length()<minF.length()&&fs[i].length()!=0){
                minF=fs[i];
            }
        }
        System.out.println(maxF.getName()+":"+maxF.length());
        System.out.println(minF.getName()+":"+minF.length());
    }

}
