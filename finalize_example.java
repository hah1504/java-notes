


class finalize_example{
    public static void main(String[] args) 
    { 

        /**
            Note : Here above output came only Main Completes and not 
            “finalize method overriden” because Garbage Collector call 
            finalize method on that class object which is eligible for 
            Garbage collection. Here above we have done->
            s = null and ‘s’ is the object of String class, so String class 
            finalize method is going to be called and not our class(i.e, Hello class).
         */
        String s = new String("RR"); 
        s = null; 


        /**
            So we modify our code like->
                Hello s = new Hello();
                s = null;
            The output will become
                finalize method overriden
                Main Completes
         */
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    } 
  
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 
} 