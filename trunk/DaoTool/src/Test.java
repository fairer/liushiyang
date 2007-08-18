import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;



public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String resource = args[0];
 		FileInputStream input = null;
		FileChannel channel  = null;
 		input = new FileInputStream(resource);
        channel = input.getChannel();
        int fileLength = (int) channel.size();
        MappedByteBuffer buffer =
            channel.map(FileChannel.MapMode.READ_ONLY, 0, fileLength);
        //Convert to character buffer
        Charset charset = Charset.forName("ISO-8859-1");
        CharsetDecoder decoder = charset.newDecoder();
//        CharBuffer charBuffer. = decoder.decode(buffer);
        char[] cr = {} ;
//        cr = charBuffer.array();
		for(int i=0;i<cr.length;i++){
			System.out.print(cr[i]);
		}
		
		
        
//		BufferedReader bf = new BufferedReader(new InputStreamReader(getResourceAsStream(resource)));
//		String returns = "";
//		while(true){
//			String str = bf.readLine();
//			if(str != null)
//				returns = returns + str + '\n';
//			else
//				break;
//		}
//		System.out.println(new String(returns.getBytes("ISO-8859-1")));
		
	}
	public static InputStream getResourceAsStream(String resource) throws IOException {
	    InputStream in = null;
	    if (in == null) in = ClassLoader.getSystemResourceAsStream(resource);
	    if (in == null) in = new FileInputStream(resource);
	    if (in == null) throw new IOException("Could not find resource " + resource);
	    return in;
	  }
}
