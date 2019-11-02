import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class getBytes {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "高爽";
        //System.out.println(str.length());
        byte[] by = str.getBytes("GB2312");
        System.out.println(by.length);
        String str2 = "";
        byte[] str3 = new byte[2];
        for (int i = 0; i < by.length; i++) {
            if (i == 0) {
                str3[0]= by[i];
                //str2 = new String(by[i],"GB2312");
            }
            if (i == 1) {
                str3[1]= by[i];
                //str2 = new String(by[i],"GB2312");
            }
        }
       // System.out.println(str2.getBytes("GB2312"));
        System.out.println(new String(str3,"GB2312"));

    }


}
