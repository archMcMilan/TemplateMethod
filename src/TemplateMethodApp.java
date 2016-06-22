/**
 * Created by Artem on 22.06.16.
 */
public class TemplateMethodApp {
    public static void main(String[] args) {
        C a=new A();
        a.templateMetod();

        C b=new B();
        b.templateMetod();
    }
}

abstract class C{
    void templateMetod(){
        System.out.println("1");
        difference();
        System.out.println("3");
        difference2();
        System.out.println();
    }
    abstract void difference();
    abstract void difference2();
}

class A extends C{

    @Override
    void difference() {
        System.out.println("2");
    }

    @Override
    void difference2() {
        System.out.println("5");
    }
}

class B extends C{

    @Override
    void difference() {
        System.out.println("4");
    }

    @Override
    void difference2() {

    }
}