

class Box {
    double length;
    double width;
    double height;
}

class understanding_reference_variables {
    public static void main(String[] args) {

        //here a reference of type Box is created
        Box b1;

        //the following line allocates memory to the reference variable b1
        b1 = new Box();

        b1.length = 2.0;
        b1.width = 2.0;
        b1.height = 2.0;

        System.out.println("Volume of b1 = " + b1.length*b1.width*b1.height);

        //here b1 and b2 refer to the same object
        Box b2 = b1;
        b2.length = 4.0;
        System.out.println("Volume of b1 = " + b1.length*b1.width*b1.height);
    }
}