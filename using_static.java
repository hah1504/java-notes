

class using_static {
    static int a = 3;
    static int b;
    int c=99;

    //a non-static method
    void hello() {
        System.out.println("Hello");    
    }


    //static method
    static void meth(int x) {    
        System.out.println("x = " + x);    
        System.out.println("a = " + a);    
        System.out.println("b = " + b);  
        //System.out.println("c = " + c);
        //hello();
    }

    //static block
    static {    
        System.out.println("Static block initialized.");    
        b = a * 4; 
    }

    public static void main(String[] args) {
        meth(42);
    }
}