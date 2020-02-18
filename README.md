# Java Revision for Interviews

Reference materials
- Java - The Complete Reference [9th Edition]


## Plan - Cover the following topics
### Easy Topics
- Java Buzzwords ✅
- Three OOP principles✅
	- Inheritance
	- Encapsulation
	- Polymorphism
	- Abstraction
- primitive types in java✅
- type conversion and casting✅
- Java arrays(initializing and declaration)✅
	- 2-d arrays
- Operators (just skim through the operators)✅
- control flow statements✅
	- for-each loop
- Class Fundamentals✅
	- what is a class?
	- what are objects?
	- declaring a class
	- what are methods
	- constructor
- **this** keyword✅
	- Instance Variable Hiding
- garbage collection✅
- finalize() method✅
- method overloading✅
- constructor overloading✅
- **static** keyword✅
- access control✅
- **final** keyword✅
- Nested and inner classes
- using command line arguments
- variable length argument
- inheritance
- golden rule - super class variable can access a subclass object
- types of inheritance supported in Java
- use of **super** in inheritance
- method overriding
- Dynamic Method Dispatch
- Abstract Classes
- use of **final** with inheritance
- **Object** class
- Packages
- Interfaces
	- **static** methods in an interfaces
- Exception handling
	- try-catch
	- nested try statements
	- throw
	- throws
	- finally
- Creating your own exception subclass
- chained exceptions

### Moderate Topics
- Multithreaded Programming
- Enumerations, Autoboxing and Annotations
- Generics
- Lambda Expressions


### Java Library Topics
Try to go through the entire library and make a note of useful classes and features.


## Notes
- Java buzzwords
	- simple
	- object oriented - not purely OO, becuase has primitive types
	- robust - provides reliability, it is strictly typed, handles memory management, and exception handling
	- multithreaded - provides support for multithreaded architectures
	- architecture neutral - JVM allows "write once, run anywhere, anytime, forever"
	- integrated and high performance - although it is cross platform provides good performance. Java is a compiled programming language, but rather than compile straight to executable machine code, it compiles to an intermediate binary form called JVM byte code. The byte code is then compiled and/or interpreted to run the program.
	- distributed - designed to work on distributed environent. Handles TCP/IP protocols. Remote Method Invocation supported bu Java, allows programs to invoke methods across the network.
	- Dynamic
- process oriented programming(C/C++), code acting on data
- object oriented programming, data controlling access to code
- **Abstraction**: we manage complexity through abstraction. e.g. We do not think of a car as a set of tens of thousands of parts, but as a well-defined object with its own unique behaviour. This allows us to drive to our workplace(or anywhere else for that matter), without being overwhelmed by the complexity. One way to manage complexity is through heirarchial abstraction
- OOP Principle 1, **Encapsulation**: Mechanism that binds together code and the data it manipulates and keeps both safe from outside interference and misuse. One way to think about encapsulation is as a protective wrapper that prevents the code and data from being arbitrarily accessed by other code defined outside the wrapper. To relate this to the real world, consider the automatic transmission on an automobile. It encapsulates hundreds of bits of information about your engine, such as how much you are accelerating, the pitch of the surface you are on, and the position of the shift lever. You, as the user, have only one method of affecting this complex encapsulation: by moving the gear-shift lever. You can’t affect the transmission by using the turn signal or windshield wipers, for example. Thus, the gear-shift lever is a well-defined (indeed, unique) interface to the transmission. Further, what occurs inside the transmission does not affect objects outside the transmission. ecause an automatic transmission is encapsulated, dozens of car manufacturers can implement one in any way they please. However, from the driver’s point of view, they all work the same. In Java, the basis of encapsulation is the class. (_Also talk about how Java implements encapsulation, using the public, private, protected keywords and class).
- A good example of abstraction and encapsulation: Suppose you go to an automatic cola vending machine and request for a cola. The machine processes your request and gives the cola.
	- Here automatic cola vending machine is a class. It contains both data i.e. Cola can and operations i.e. service mechanism and they are wrapped/integrated under a single unit Cola Vending Machine. This is called Encapsulation.
	- You need not know how the machine is working. This is called Abstraction.
	- You can interact with cola can only through service mechanism. You cannot access the details about internal data like how much cans it contains, mechanism etc. This is Data Hiding.
	- You cannot pick the cola can directly. You request for cola through proper instructions and request mechanism (i.e. by paying amount and filling request) and get that cola only through specified channel. This is message passing.
- OOP Principle 2, **Inheritance**: Inheritance is the process by which one object acquires the properties of another object. (Allows reuse of code). It is important because it supports the concept of heirarchial classification. For eg. A Golden Retriever is a breed of dog, which is in turn a mammal, which is in turn an animal. Without the use of hierarchies, each object would need to define all of its characteristics explicitly. However, by use of inheritance, an object need only define those qualities that make it unique within its class. It can inherit its general attributes from its parent. Thus, it is the inheritance mechanism that makes it possible for one object to be a specific instance of a more general case. 
- OOP Principle 3, **Polymorphism**: Polymorphism(meaning, "many forms"), is a feature that allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. Consider a stack (which is a last-in, first-out list). You might have a program that requires three types of stacks. One stack is used for integer values, one for floating-point values, and one for characters. The algorithm that implements each stack is the same, even though the data being stored differs. In a non–object-oriented language, you would be required to create three different sets of stack routines, with each set using different names.However, because of polymorphism, in Java you can specify a general set of stack routines that all share the same names. Polymorphism is defined by “one interface, multiple methods.” Extending the dog analogy, a dog’s sense of smell is polymorphic. If the dog smells a cat, it will bark and run after it. If the dog smells its food, it will salivate and run to its bowl. The same sense of smell is at work in both situations. The difference is what is being smelled, that is, the type of data being operated upon by the dog’s nose!
- _main()_ method is declared public because it is called by code outside(JVM) of its class when the program begins.
- Java is a **strongly typed** language, i.e. every variable and expressions have a type and that type is explicitly defined. All assignments are checked for type compatibility.
- Primitive types: Integers(byte, short, int, long), Floating Point(float, double), Characters(char), Boolean. 
- All primitive types in java have a strictly defined range(unlike C/C++ which depends on the environment the programs are run)
- Automatic type conversion: When one type of data is assigned to another type of variable, automatic type conversion takes place, when the following two condition are met
	1. the two types are compatible
	2. destination type is larger than source type<br>
When these two conditions are met, a widening conversion takes place. For widening conversions, the numeric types, including integer and floating-point types, are compatible with each other. However, there are no automatic conversions from the numeric types to char or boolean. Also, char and boolean are not compatible with each other
- Casting incompatible types(narrowing conversion): To create a conversion between two incompatible types, you must use a **cast**. A cast is
simply an explicit type conversion. It has this general form: 
	`(target-type) value`
Example - the following casts an integer to byte
	```java
	   int a;
	   byte b;
       // …
	   b = (byte) a;
	```
- casting a float to int will cause truncation
- arrays are group of variables of the same type referred by a common name. 
	- `int month_days[]` declares an array, but at this point no array actually exists
	- To link the array with actual physical array of integers we allocate memory to it using **new** keyword. This is how its done. `month_days = new int[12]`.
	- All arrays in java are dynamically allocated
	- [Arrays Program](https://github.com/zed1025/java-notes/blob/master/arrays.java)
	- declaring 2-d arrays. `int matrix[][] = new int[3][3];`. We can even declare the second dimension manually.
		```
		int twoD[][] = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		```
- Java does not support pointers because of security reasons.  Java cannot allow pointers, because doing so would allow Java programs to breach the firewall between the Java execution environment and the host computer. (Remember, a pointer can be given any address in memory—even addresses that might be outside the Java run-time system.)
- The _expression_ in switch statements must be one of the following types - byte, short, int, char, enumeration, 
- Nested swithc statements are possible in Java
- Difference between switch and if-else statements: switch can only test for equality, whereas if-else can evaluate any boolean expression. 
- A switch statement is generally more effifient than nested **if**s.  When it compiles a switch statement, the Java compiler will inspect each of the case constants and create a “jump table” that it will use for selecting the path of execution depending on the value of the expression. Therefore, if you need to select among a large group of values, a switch statement will run much faster than the equivalent logic coded using a sequence of if-elses. 
- In java **,** is not an operator, it is a seperator
- For-each loop: It has the following syntax `for(type itr-var : collection) statement-block`. One thing to note about for-each loops, is that they are just for iterating the entire array, we cannot change array elements using this loop
	```java
	int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	for(int x: nums) {
	System.out.print(x + " ");
	x = x * 10; // no effect on nums
	}
	```
	- [For-each Program](https://github.com/zed1025/java-notes/blob/master/for_each.java)
- Uses of **break** statement
	- exiting loops
	- in switch statements
	- as a form of GOTO
- classes define a new data-type. Once defined we can use this new type to create objects of that type. 
- class is a template for an object. An object is instance of class
- The **new** operator dynamically allocates memory for an objevt and returns a reference to it.
- In java all objects are dynamically allocated
- A constructor defines what happens when an object of a class is created.
- **new** allocated memory for an object during run-time
- `Box myBox;`, here a reference variable of type Box is created. `myBox = new Box();`, here memory is allocated to the reference variable. [Understanding reference variables](https://github.com/zed1025/java-notes/blob/master/understanding_reference_variables.java). When you assign one object reference variable to another object reference variable, you are not creating a copy of the object, you are only making a copy of the reference.
- Facts about **constructors**
  - initializes an object immediately upon creation
  - it has the same name as the class
  - syntactically similar to a method
  - they do not have any return type, not even void, this is because the implicit return type of a class' constructor is the class itself. [Box With Constructor](https://github.com/zed1025/java-notes/blob/master/box_with_constructor.java)
- uses of **this** keyword
  - __this__ can be used inside any method to refer to the current method
  - this is always a reference to the object on which the method was invoked
- Instance variable hiding. [Instance Variable Hiding](https://github.com/zed1025/java-notes/blob/master/instance_variable_hiding.java)
  - when a local variable has the same name as an instance variable, the local variable hides the instance variable.
- How **garbage collection**(GC) works in java?
  -  when no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed.
  -  There is no explicit need to destroy objects as in C++
  -  the GC is invoked sporadically and not at any particular or regular intervals. You do not need to worry about GC while writing Java programs
  -  the **finalize()** methods is used to performs some action befor the object is destroyed. 
     -  By using finalization, you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
     -  To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever it is about to recycle an object of that class. Inside the finalize( )method, you will specify those actions that must be performed before an object is destroyed.
     -  It is important to understand that finalize( ) is only called just prior to garbage collection. It is not called when an object goes out-of-scope
     -  This means that you cannot know when—or even if—finalize( ) will be executed.  Therefore, your program should provide other means of releasing system resources, etc., used by the object. It must not rely on finalize( ) for normal program operation.
     -  [Finalize example](https://github.com/zed1025/java-notes/blob/master/finalize_example.java)
     -  The finalize( ) method only approximates the function of a destructor. 
-  Method Overloading
   -  2 or more methods with the same name but different parameter declarations
   -  Java uses the type and/or number of arguments as its guide to determine which version of the overloaded method to actually call
   -  the return type alone is insufficient to distinguish two versions of a methods[Method Overloading 1](https://github.com/zed1025/java-notes/blob/master/method_overloading_1.java)
   -  Method overloading supports **polymorphism** because it is one way that Java implements the “one interface, multiple methods” paradigm. 
-  Parameter passing in java
   -  When you pass a primitive type to a method, it is passed by value. 
   -  When you pass an object to a method, those objects are passed by what is effectively call-by-reference. This is because when you create a variable of a class type, you are only creating a reference to an object. [Call by reference](https://github.com/zed1025/java-notes/blob/master/call_by_reference.java)
-  Java supports recursion.[Tower of Hanoi](https://github.com/zed1025/java-notes/blob/master/tower_of_hanoi.java)
-  **Access Control**
   -  Encapsulation provides _access control_
   -  Through encapsulation, you can control what parts of a program can access the members of a class. 
   -  How a member can be accessed is determined by the access modifier attached to its declaration. Java supplies a rich set of access modifiers. Some aspects of access control are related mostly to inheritance or packages. (A package is, essentially, a grouping of classes.) These parts of Java’s access control mechanism will be discussed later. Here, let’s begin by examining access control as it applies to a single class. Once you understand the fundamentals of access control, the rest will be easy.
   -  `public` modifier
      -  When a member of a class is modified by public, then that member can be accessed by any other code. 
      -  When no access modifier is used, then by default the member of a class is public within its own **package**, but cannot be accessed outside of its **package**.
   -  `private` modifier
      -  When a member of a class is specified as private, then that member can only be accessed by other members of its class. 
-  `static` members. [Using static](https://github.com/zed1025/java-notes/blob/master/using_static.java)
   -  a class member that will be used independently of any object of that class.
   -  To create such a member, precede its declaration with the keyword `static`.
   -  You can declare both methods and variables to be static.   
   -  The most common example of a static member is main( ). main( ) is declared as static because it must be called before any objects exist.
   -  **Instance variables declared as static are, essentially, global variables. When objects of its class are declared, no copy of a static variable is made. Instead, all instances of the class share the same static variable.**
   -  Methods declared static have the following restrictions
      -  They can only directly call other static methods.`using_static.java:20: error: non-static method hello() cannot be referenced from a static context`
      -  They can only directly access static data. `using_static.java:19: error: non-static variable c cannot be referenced from a static context`
      -  They cannot refer to `this` or `super` in any way. 
   -  If you need to do computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded.
   -  Outside of the class in which they are defined, static methods and variables can be used independently of any object. To do so, you need only specify the name of their class followed by the dot operator. For example, if you wish to call a static method from outside its class, you can do so using the following general form: `classname.method( )`. A static variable can be accessed in the same way—by use of the dot operator on the name of the class. This is how Java implements a controlled version of global methods and global variables.
-  `final`
   -  A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant.
   -  you must initialize a final field when it is declared
   -  both method parameters and local variables can be declared final. Declaring a parameter final prevents it from being changed within the method. Declaring a local variable final prevents it from being assigned a value more than once.
   -  use of final with methods is related to inheritance.
   -  
-  Arrays in java are implemented as objects. 
   -  `arrName.length` gives the length of the array. the value of lengthhas nothing to do with the number of elements that are actually in use. It only reflects the number of elements that the array is designed to hold
-  Nested and Inner classes
   -  The Java programming language allows you to define a class within another class. Such a class is called a nested class and is illustrated here:
		```
		class OuterClass {
			...
			class NestedClass {
				...
			}
		}
		```
   - Nested classes are divided into two categories: static and non-static. Nested classes that are declared static are called static nested classes. Non-static nested classes are called inner classes. 
		```
		class OuterClass {
			...
			static class StaticNestedClass {
				...
			}
			class InnerClass {
				...
			}
		}
		```
   - The most important type of nested class is the inner class. An inner class is a non-static nested class. It has access to all of the variables and methods of its outer class and may refer to them directly in the same way that other non-static members of the outer class do. [Inner Class](https://github.com/zed1025/java-notes/blob/master/inner_class.java)
   - A static nested class is one that has the static modifier applied. Because it is static, it must access the non-static members of its enclosing class through an object. That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes are seldom used. [Static nested class](https://github.com/zed1025/java-notes/blob/master/static_nested_class.java)
   - Uses of nested classes. [link](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)
     1. **It is a way of logically grouping classes that are only used in one place**: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.
     2. **It increases encapsulation**: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.
     3. **It can lead to more readable and maintainable code**: Nesting small classes within top-level classes places the code closer to where it is used.
     4. Useful in event handling
  - Most commounly inner classes are declared as members within an outer class scope, but it is possible to define inner classes within any block scope. For example, you can define a nested class within the block defined by a method or even within the body of a for loop. [Inner Class Block Scope](https://github.com/zed1025/java-notes/blob/master/inner_class_block_scope.java)
- [Why are java strings immutable?](https://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html)
  - _Some_ useful string methods
    - `boolean equals(secondStr)`, You can test two strings for equality
    - `int length( )`, You can obtain the length of a string 
    - `char charAt(index)`, You can obtain the character at a specified index within a string
- Using **command-line-arguments** in java
  - used to pass information into a program when you run it
  - To access the command-line arguments inside a Java program is quite easy—they are stored as strings in a String array passed to the args parameter of main( )
  - The first command-line argument is stored at args[0], the second at args[1], and so on.
  - All command-line arguments are passed as strings. You must convert numeric values to their internal forms manually
- Variable length argument
  -  creation of methods that need to take a variable number of arguments. 
  -  This feature is called _varargs_ and it is short for _variable-length arguments_. A method that takes a variable number of arguments is called a _variable-arity method_, or simply a _varargs method_.
  -  eg. `printf()` method in Java.io library uses varargs
  -  A variable-length argument is specified by three periods `(...)`. For example, here is how vaTest( ) is written using a vararg `static void vaTest(int ... v) {`.
  -  [Variable Argument 1](https://github.com/zed1025/java-notes/blob/master/var_len_arg1.java). This syntax tells the compiler that vaTest( ) can be called with zero or more arguments. As a result, v is implicitly declared as an array of type int[ ]. Thus, inside vaTest( ), v is accessed using the normal array syntax.
  -  A method can have “normal” parameters along with a variable-length parameter. However, the variable-length parameter must be the last parameter declared by the method. E.g. `int doIt(int a, int b, double c, int ... vals) {`
  -  There is one more restriction to be aware of: **there must be only one varargs parameter**. For example, this declaration is also invalid: `int doIt(int a, int b, double c, int ... vals, double ... morevals) { // Error!`.
  -  You can overload a method that takes a variable-length argument. [Overloaded Varargs](https://github.com/zed1025/java-notes/blob/master/var_len_arg2.java)
  -  A varargs method can also be overloaded by a non-varargs method. 









## List of Programs
- [Hello World program](https://github.com/zed1025/java-notes/blob/master/HelloWorld.java)
- [Arrays Program](https://github.com/zed1025/java-notes/blob/master/arrays.java)
- [For-each Program](https://github.com/zed1025/java-notes/blob/master/for_each.java)
- [Understanding reference variables](https://github.com/zed1025/java-notes/blob/master/understanding_reference_variables.java)
- [Box With Constructor](https://github.com/zed1025/java-notes/blob/master/box_with_constructor.java)
- [Instance Variable Hiding](https://github.com/zed1025/java-notes/blob/master/instance_variable_hiding.java)
- [Finalize example](https://github.com/zed1025/java-notes/blob/master/finalize_example.java)
- [Method Overloading 1](https://github.com/zed1025/java-notes/blob/master/method_overloading_1.java)
- [Call by reference](https://github.com/zed1025/java-notes/blob/master/call_by_reference.java)
- [Tower of Hanoi](https://github.com/zed1025/java-notes/blob/master/tower_of_hanoi.java)
- [Using static](https://github.com/zed1025/java-notes/blob/master/using_static.java)
- [Inner Class](https://github.com/zed1025/java-notes/blob/master/inner_class.java)
- [Static nested class](https://github.com/zed1025/java-notes/blob/master/static_nested_class.java)
- [Inner Class Block Scope](https://github.com/zed1025/java-notes/blob/master/inner_class_block_scope.java)
- [Variable Argument 1](https://github.com/zed1025/java-notes/blob/master/var_len_arg1.java)
- [Overloaded Varargs](https://github.com/zed1025/java-notes/blob/master/var_len_arg2.java)



<!-- pallavi - 846002004n5 -->