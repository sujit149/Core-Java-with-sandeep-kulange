*** Command Line argument : 
                           - public static void main (String[] args) 
                           - In args we can receive the arguments 
                                String name = args[0];
                                int empid = Integer.parseInt(args[1]);
                           - and while running code from terminal we can pass the arguments
                                javac Lecture3.java
                                java Lecture3 Sujit 1 200000.10

                            - That mean we can pass the arguments while running the code through the terminal and receive and use it in code


*** Java Buzzwords/ Features

   1] Simple - 
               * Java language is derived from c and c++ . In other words, Java follows syntax of c and concept of c++
               * Syntax of Java is simpler that syntax of c and c++
                  1] No need to include header file
                  2] Do not support structure and union. But it supports enum
                  3] Do not support deafult argument 
                  4] do not support constructor member initialiser list
                  5] do not support delete operator and destructor
                  6] do not support frienf function and friend class
                  7] Do not support copy constructor and operator overloading
                  8] Do not support private and protected mode of inheritance 
                  9]Do not support multi-class inheritance in other words , it does not support multiplr implementation inheritance
                  10] we acnot declare global variable and function
                  11] do not support pointer

    2] Java is a object oriented programming language
             - Alan Kay -> Inventor of OOPS and Simula
             - Grady booch -> inventor of UML and author of object oriented Analysis and design with application
             - according to Grady Booch there are 4 major and 3 minor pillars / parts /  element of OOPS.

             - 4 major pillars of oops
                1] Abstraction
                2] Encapsulation
                3] Modularity
                4] Hierarchy
            - according to grady booch if we want to consider any language OO (object oriented) then it must support 4 major pillars of oops

            - 3 Minor Pillars of OOPS
                 1] Typing / Polymorphism
                 2] Concurrency
                 3] Persistence

            - If Language support to above features then it will be considered as useful but not essential to classify language as Object oriented
            - Sice Java Support to all major and minor pillars of oops hence it is considered as object oriented


   3] Architecture Neutral: 
    - CPU Architectures : X86, X64, ARM, POWER PC , SPARK , ALPHA etc.
    - Java compiler convert java source code into byte code
    - Native CPU cannot execute bytecode direcltly
    - Execution engine of JVM converts bytecode inot native code
    - .class file contains bytecode which is CPU neutral code makes Java architecture neutral
    - Since Java is architecture neutral, java developer need not to worry about underlying hardware and operating system


    4] Java is Portable Programming Language-

            - Term portable is related to executable 
            - Java is portable beacuse Java is archittecture neutral
            - Size of data types on all platform is constant / same
            - Sice java is portable it does not support sizeOfOperator
    
    5] Java is Robust programming language
            - Java is architecture neutral
            - Java is object oriented programming language
            - Java's memory mangement as garbage collector automatically do clearing of memory work
            - exception handling (As java provides the exception handling
            
    6] Java is Multithreaded Progtramming language

             - JVM is responsible for managing exceution of java application
             - Threads : light weight process or sub process is called thread
             - when JVM starts execution of Java appliaction then it also start execution of 2 threads ie. main thread and garbage collector 
             - Beacuse of main thread and garbage collector every java application is multithreaded
             - Main  thread 
                1] It is user thread / non demon thread
                2] It is responsible for invoking main method
             - garbage collector / Finalizer 
                1] It is demon thread/ backgroung thread
                2] it is responsible for deallocating memory of unused objects



*** Scanner Demo/ for user Inputs
        - Scanner is a final class decalred in java.util package
        - we need to create an object of scanner before using it
           java.util.Scanner sc = new java.util.Scanner(System.in);

        - OR
          import java.uitl.Scanner;
          Scanner sc = new Scanner (System.in);


        - we need to use the methods defined in scnner class to use various data types or take input from various data types

        - methods: 
             1] public String nextLine()
             2] public int nextInt()
             3] public float nextFloat()
             4] public double nextDouble()




*** OOPS Concepts - 

  --- Class-

                Example to understand the class
                1] Let us consider Employee
                    - name: String
                    - empId : int
                    - salary : float
                    - name , empId and salary are related to Employee

         * If we want to group the related data element together then we should use Class.
         * class is keyword in java
         * If we want to define class then first it is necessary to understand problem statement
         * A variable declared inside class is class field
         * If we want to store value inside non static field then we must create object of the class
         * In java object is called as instance
         * class is non primitive type / reference type
         * If we want to create instance of a class then we should use new operator
         * we can create object or instance using the new keyword also object get memory on heap section
         * Non static field get space once per instance according to order of declaration
         * In java all instance are anonymous
         * If we want to perform operation on instance then it is necessary to create object reference / reference


    
