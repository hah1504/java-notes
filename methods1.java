

class Box {
    double width;  double height;  double depth;

    double volume() {
        return width*height*depth;
    }

    void method_with_param(String boxName) {
        System.out.println("Box Name: " + boxName);
        System.out.println("Volume: "+width*height*depth);
    }
}


class methods1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.width = 2.0;
        b1.height = 2.0;
        b1.depth = 2.0;
        

        System.out.println("Volume is: "+b1.volume());
        b1.method_with_param("Mango Box");
    }
}