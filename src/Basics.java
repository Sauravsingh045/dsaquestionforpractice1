public class Basics {
    public static void main(String[] args) {
       //hello_world
        System.out.println("Hello world");
        // finding size of datatype
        System.out.println(Integer.SIZE/8);

        //swapping two number
int a=89;
int b=76;
int temp = 0;
//logic
        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);
       temp=a;
       a=b;
       b=temp;
        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);

        //ascii no.
        char c='a';
        int ac=c;
        System.out.println("ascii no : " + ac);

    }
}
