package string;

public class StartsWithDemo {
    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        //判断str是否是以“www”开始的
        String str ="www.tedu.cn";
        boolean starts =str.startsWith("www");
        System.out.println("starts:"+starts);

        //判断str是否是以".cn"结尾的
        boolean ends =str.endsWith(".cn");
        System.out.println("ends"+ends);
    }
}
