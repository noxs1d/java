package strings;

import java.util.regex.Pattern;

public class StringClass {
    public static void main(String[] args) {
        String string="    689  980   ";
        String str=new String("    689  980   ");
        System.out.println(str==string);
        System.out.println(str.equals(string));
        System.out.println(string.compareTo(str));
        System.out.println(string.strip());
        System.out.println(str.replaceAll("\\s+",""));
        System.out.printf("He%do leet%s",77,"Code\n");
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.insert(0,str);
        System.out.println(stringBuilder +" "+ stringBuilder.reverse());
        Pattern pattern=Pattern.compile("java.lava.",Pattern.COMMENTS);
        System.out.println(pattern.pattern()+"\n"+Pattern.matches("j.+a","java"));
    }
}
