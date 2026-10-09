class Lecture3 {
    public static void main (String[] args) {
        // program to fetch values from command line
        // String name = args[0];
        // int empid = Integer.parseInt(args[1]);
        // float salary = Float.parseFloat(args[2]);

        // System.out.println("Name : " + name);
        // System.out.println("empid : "+ empid);
        // System.out.println("salary : "+ salary);

        


        // Program to take input from user

        java.util.Scanner sc = new java.util.Scanner (System.in);
        System.out.print("Please enter the name : ");
        String name = sc.nextLine();

         System.out.print("Please enter the empId : ");
         int empId = sc.nextInt();

         System.out.print("Please enter the salary : ");
         float salary = sc.nextFloat();

         System.out.println("Name is " + name);
         System.out.println("emp id is" + empId);
         System.out.println("Salary is" + salary);
    }
}