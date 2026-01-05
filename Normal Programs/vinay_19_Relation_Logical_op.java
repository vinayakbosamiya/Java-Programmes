package strings;

public class vinay_19_Relation_Logical_op {
    static void main() {

        boolean a = true;
        boolean b = true;

        if(a && b){
            System.out.println("this is for 'AND' operator : y");
        }else
        {
            System.out.println("this is for 'AND' operator : N");
        }

        boolean c = false;
        boolean d = true;

        if(c || d){
            System.out.println("this is for 'or' operator : y");
        }else
        {
            System.out.println("this is for 'or' operator : N");
        }
    }
}
