



class Outer {
    
    int outer_x = 100;
    static int outer_y = 200;


    static void test2() {
        System.out.println("Hello from test2");
    }

    void test3 () {
        System.out.println("Hello from test3");
    }

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // static nested class
    static class Inner {


        void display() {
            // static nested class cannot access the non-static members of the outer class directly, it can be done using objects
            // System.out.println("display: outer_x = " + outer_x);    //static_nested_class.java:30: error: non-static variable outer_x cannot be referenced from a static context
            System.out.println("display: outer_y = " + outer_y);

            test2();
            // test3();    //static_nested_class.java:34: error: non-static method test3() cannot be referenced from a static context
        }
    }
}


class static_nested_class {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.test();
    }
}