
class A {
    int a = 100;
    private int b = 200;
    protected int c = 300;
    static int d = 400;

    protected void display1() {
        System.out.println("From display1()");
    }

    static void display2() {
        System.out.println("From display2()");
    }

    private void display3() {
        System.out.println("From display3()");
    }

    void display4() {
        System.out.println("From display4()");
    }

}


class B extends A {
    public void test() {
        // can access
        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("d="+d);
        display1();
        A.display2();
        display2();
        display4();
        super.display4();


        // cannot access, will give error
        // System.out.println("b="+b); //inheritance2.java:37: error: b has private access in A
        // display3(); //inheritance2.java:40: error: cannot find symbol


        a = 1000;
        System.out.println("a="+a);
        c = 3000;
        d = 4000;
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}


class inheritance2 {

    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}