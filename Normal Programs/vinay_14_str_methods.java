package strings;

public class vinay_14_str_methods {
    static void main() {
        String name1 = "    VINAY      ";
        String name = "vinay";
        int val = name.length();
        System.out.println(val);


        //  STRING METHODS
        System.out.println("toLowerCase         :    "+name1.toLowerCase());
        System.out.println("toUpperCase         :    "+name.toUpperCase());
        System.out.println("without trim        :    "+name1);
        System.out.println("with trim function  :    "+name1.trim());
        System.out.println("substring           :    "+name.substring(2));
        System.out.println("using replace       :    "+name.replace('n','j'));
        System.out.println("endsWith            :    "+name.endsWith("nay"));
        System.out.println("startsWith          :    "+name.startsWith("v"));
        System.out.println("charAt              :    "+name.charAt(2));
        System.out.println("indexOf             :    "+name.indexOf("a",1));  // first is given character and second is where to from find it that character
        System.out.println("lastIndexOf         :    "+name.lastIndexOf("inay")); // in this function to show first character for index and that index return now
        System.out.println("equals              :    "+name.equals("vinay")); // in this function to show first character for index and that index return now
        System.out.println("equalsIgnoreCase    :    "+name.equalsIgnoreCase("Vinay")); // in this function to show first character for index and that index return now
        System.out.println("escape Sequence     :    \\vinay"); // \\ this double backSlash is "escape sequence"
    }
}
