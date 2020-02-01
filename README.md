# Java Revision for Interviews

Reference materials
- Java - The Complete Reference [9th Edition]


## Plan - Cover the following topics
### Easy Topics
- Java Buzzwords
- Three OOP principles
	- Inheritance
	- Encapsulation
	- Polymorphism
	- Abstraction
- primitive types in java
- type conversion and casting
- Java arrays(initializing and declaration)
	- 2-d arrays
- Operators (just skim through the operators)
- control flow statements
	- for-each loop
- Class Fundamentals
	- what is a class?
	- what are objects?
	- declaring a class
	- what are methods
	- constructor
- **this** keyword
	- Instance Variable Hiding
- garbage collection
- finalize() method
- method overloading
- constructor overloading
- **static** keyword
- access control
- **final** keyword
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
	- [Arrays Program]('')
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





## List of Programs
- [Hello World program]('')
- [Arrays Program]('')




pallavi - 846002004n5