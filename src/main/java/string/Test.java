package string;
public class Test {
    public static void main(String[] args) {
        String s1 =getHostName("www.tedu.cn");
        String s2 =getHostName("http://www.tarena.com");
        String s3 =getHostName("doc.canlaoshi.com.cn");
        System.out.println("s1:"+s1);
        System.out.println("s2"+s2);
        System.out.println("s3"+s3);




    }

    public static String getHostName(String address) {
        //地址中第一个“."之后的位置
         int start =address.indexOf(".")+1;
         //地址中第二个“。”的位置
         int end =address.indexOf(".",start);
                   return address.substring(start,end);
    }
}
