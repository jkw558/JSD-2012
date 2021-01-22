package string;

public class TeUpperCaseDemo {
    /**
     *
      * @return
     *  String  toLowerCase()
     *  将当前字符串中的英文部分转换为全小写
     *
     *  String toUpperCase()
     *  将当前
     */


    public static void main(String[] args) {


        String str ="我爱Java";
        System.out.println(str);

        String upper =str.toUpperCase();
        System.out.println(upper);
        String lower =str.toLowerCase();
        System.out.println(lower);



        String code ="Ae3Gh";
        String input ="ae3gh";
        code =code.toLowerCase();
        input =input.toLowerCase();
        if(code.equals(input)){
            System.out.println("通过");
        }else {
            System.out.println("怒通过");
        }
        }
    }

