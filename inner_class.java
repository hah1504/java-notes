

class Outer {
    int outer_x = 100;
    private int outer_y = 300;

    void test() {
        // outer class cannot directly access the members of the inner class. it has to do this using objects
        Inner inner = new Inner();
        inner.display();
    }

    //inner Class
    class Inner {
        void display() {
            // inner class can access the members of the outer class, reverse is not true
            System.out.println("display: outer_x = " + outer_x);
            System.out.println("display: outer_y = " + outer_y);
        }
    }
}


class inner_class{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();    
    }
}