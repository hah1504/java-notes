

class Box {
    double a, b, c;
    Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int volume() {
        System.out.println("Return type is int");
        return (int)(a*b*c);
    }

    //error, because java cannot distinguish methods solely on the basis of return types
    double volume() {
        System.out.println("Return type is double");
        return a*b*c;
    }
}

class method_overloading_1 {
    public static void main(String[] args) {

    }
}