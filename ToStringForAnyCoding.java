
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class ToStringForAnyCoding {
    public static byte[] toByteArray(InputStream in) throws IOException
    {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
 
        byte[] buffer = new byte[1024];
        int len;
 
        // считываем байты из входного потока и сохраняем их в буфере
        while ((len = in.read(buffer)) != -1)
        {
            // записываем байты из буфера в выходной поток
            os.write(buffer, 0, len);
        }
 
        return os.toByteArray();
    }
    public static String readAsString(InputStream inputStream) throws IOException {
        
        
       return new String(toByteArray(inputStream),"ASCII");
    }

    public static void main(String[] args) {
        byte[] word = { 48, 49, 50, 51 };
        try (ByteArrayInputStream myStream = new ByteArrayInputStream(word)){
            
            System.out.println(readAsString(myStream));
        } catch (IOException e) {
        }

    }
}
