package string;

import java.net.SocketTimeoutException;

/**
 *
 * String trim()
 * 去除字符串两边的空白字符
 *
 *
 */
public class TireDemo {
    public static void main(String[] args) {
        //         左侧三个空格，左侧三个tab
        String str ="   herp           ";
        System.out.println(str);
        String trim=str.trim();
        System.out.println(trim);
    }
}
