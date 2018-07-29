import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class tt {
    public static void main(String[] args) {

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("1.txt","rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while(fileChannel.read(byteBuffer)>-1){
                System.out.println(byteBuffer.getChar());
            }
            fileChannel.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
