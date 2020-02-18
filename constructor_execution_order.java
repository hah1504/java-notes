// Demonstrate when constructors are called.

// without using super
// Create a super class.
class A {
  A() { 
    System.out.println("Inside A's constructor.");
  }
}

// Create a subclass by extending class A.
class B extends A {
  B() {
    System.out.println("Inside B's constructor.");
  }
}

// Create another subclass by extending B.
class C extends B {
  C() {
    System.out.println("Inside C's constructor.");
  }
}




//using super
// Create a super class.
class A2 {
  A2() { 
    System.out.println("Inside A2's constructor.");
  }
}

// Create a subclass by extending class A2.
class B2 extends A2 {
  B2() {
    super();
    System.out.println("Inside B2's constructor.");
  }
}

// Create another subclass by extending B2.
class C2 extends B2 {
  C2() {
    super();
    System.out.println("Inside C2's constructor.");
  }
}






  
class constructor_execution_order {
  public static void main(String args[]) {
    C c = new C();
    C2 c2 = new C2();
  }
}