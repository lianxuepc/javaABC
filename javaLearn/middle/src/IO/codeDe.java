package IO;

import java.nio.charset.StandardCharsets;

public class codeDe
{
    public static void main(String[] args)
    {
        String str="中国";
        byte[] bytes=new byte[1024];
        bytes=str.getBytes(StandardCharsets.UTF_8);

        for(byte b:bytes)
        {
            System.out.println(b);
        }

        String bm=new String(bytes);
        System.out.println(bm);

    }
}
