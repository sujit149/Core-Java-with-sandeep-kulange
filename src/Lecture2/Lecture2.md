*** Meaning of System.out.println("Hello world");

  - System : It is final class declared in java.lang Package
  - out : It is reference of instance(object) of printStream class. It is public static final field of system class
  - print, printf, println : It is non static method of java.io.PrintStream class
  - Java.lang package contains all the fundamental classes of core java
  - java.lang package is imported by default in every .java file


***  Entry Point Method
    -Meaning of Public  Static void main (String[] args)
    - we can overload main method in java
    - we can define main method per class but only one main can be considered as entry point method in java
    -If suitable main method is not available inside class then compiler do not generate error but JVM generate error
    - If .java file do not contain any type (interface/class/enum) then java compiler do not generate .class file
    - Java compiler generates .class file per type defined in .java file


*** Data types
    * Data type of any variable/ instance describes 4 things
      - Memory: how much memory is required to store the data
      - Nature: Which type of data is allowed to store inside memory
      - Operation : which opeartions (functionality) are allowed to perform on data
      -Range : Set of values which are allowed to store inside memory
    
    *Types of Data types in Java
      1] Primitive Data Type
          - It is also called as value type
          - There are 8 primitive/ value types in java
                                                         default value              wrapper class 
               1] boolean : Size is not mentioned ,      false                          Boolean
               2] byte    : 1 byte                          0                            Byte
               3] char    : 2 byte                          \u0000                      Character
               4] short   : 2 byte                          0                           Short
               5] int     : 4 byte                          0                           Integer
               6] float   : 4 byte                          0.0f                        Float
               7] double  : 8 byte                          0.0d                        Double
               8] long    : 8 byte                          0L                          Long

         - Variable of primitive/ value type get space on Java Stack
         - In java , primitive primitive types are not classes, but for every primitive type class is given it is called wrapper class 

      2] Non Primituve Data Types
          - It is also called as reference type
          - There are 4 non primitive / reference types in java
             1] Interface
             2] Class
             3] Enum
             4] Array

          - Instance of non primitive/ reference type get space on Heap

*** Component of JVM
        1] Class Loader Sub System : 
                - Classloader is responsible for loading .class file HDD into JVM memory
                - Types of class loader: 
                   1] Bootstrap ClassLoader
                   2] Extension Classoader
                   3] Appliaction ClassLoader

        2] runtime Data Areas
                   1] Method Area
                   2] Heap
                   3] Java stack
                   4] PC register
                   5] Native Method stack 
        3] Execution Engine
                   1] Interpreter
                   2] JIT

*** Dynamically type checked language
   * In python : 
                ex. number = 10   // valid 

                In python type of variable can be decided by looking towards value 

*** Statically type checked Language
       Consider example in java
       int number = 1;  // valid

       * Java compiler do not decide type of variable based on value if we want to use any variable it is mandatory to mention its type
       * we cannot declare variable without initializing it

*** Widening: 
             - widening is a process of converting value of variable of narrower type to wider type 
             ex: suppose if we are converting int value to double 
             - also explicit type casting is optional
             - example byte-> short -> int->float->long->double this conversion is widening conversion

*** Narrowing: 
             - narrowing is a process of converting value of variable of wider type to narrower type 
             ex: suppose if we are converting double value to int 
             - also explicit type casting is mandatory
             - example  double->long->float->int->short->byte this conversion is narrower conversion
            
