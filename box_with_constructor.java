class Box {
    double width;  double height;  double depth;

    //constructor for Box class
    Box() {
        System.out.println("Constructing Box");    
        width = 10;    
        height = 10;    
        depth = 10;
    }

    double volume() {
        return width*height*depth;
    }

    void method_with_param(String boxName) {
        System.out.println("Box Name: " + boxName);
        System.out.println("Volume: "+width*height*depth);
    }
}


class box_with_constructor {
    public static void main(String[] args) {
        Box b1, b2;

        b1 = new Box();
        System.out.println("Volume of b1 = "+b1.volume());
        b2 = new Box();
        System.out.println("Volume of b2 = "+b2.volume());
    }
}