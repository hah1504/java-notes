

class throws_demo {

    public static void test() throws ArithmeticException {
        int d = 45/0;
        System.out.println(d);
    }

    public static void main(String[] args) {
        try{
            test();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }
        
    }
}