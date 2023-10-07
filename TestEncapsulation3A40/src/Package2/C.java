package Package2;
import Package1.A;
public class C extends A{
public C(){

    this.w=5;
}
    public static void main(String[] args) {
        A a=new A();
        a.x=5;

        C c=new C();
        c.w=5;
    }
}
