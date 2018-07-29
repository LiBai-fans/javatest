import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ShortBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class test {
    public static void main(String[] args) {
        try{
            String s = "ss dds  sdd ddd aaa ddww fff fhhh" ;
            RandomAccessFile randomAccessFile = new RandomAccessFile("1.txt","rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int c = fileChannel.read(byteBuffer);
            System.out.println(c);
            Charset charset = null;
            CharsetDecoder decoder = null;
            CharBuffer charBuffer = null;
            charset=Charset.forName("UTF-8");
            decoder = charset.newDecoder();
            charBuffer = decoder.decode(byteBuffer.asReadOnlyBuffer());
            System.out.println(charBuffer.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
