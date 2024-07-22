package strings;

public class StringClass {
    public static void main(String[] args) {
        String string="    689  980   ";
        String str=new String("    689  980   ");
        System.out.println(str==string);
        System.out.println(str.equals(string));
        System.out.println(string.compareTo(str));
        System.out.println(string.strip());
        System.out.println(str.replaceAll("\\s+",""));
        System.out.printf("He%do leet%s",77,"Code");
    }
}
