
class Box {
    double width;  double height;  double depth;

    //constructor for Box class
    Box() {
        System.out.println("Constructing Box");    
        width = 10;    
        height = 10;    
        depth = 10;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width*height*depth;
    }

    void method_with_param(String boxName) {
        System.out.println("Box Name: " + boxName);
        System.out.println("Volume: "+width*height*depth);
    }
}



class instance_variable_hiding {
    public static void main(String[] args) {
        Box b1 = new Box(1, 2, 3);
        System.out.println("Volume is = "+b1.volume());
    }
}