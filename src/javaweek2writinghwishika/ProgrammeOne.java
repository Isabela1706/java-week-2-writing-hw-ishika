package javaweek2writinghwishika;

/**
 *Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class ProgrammeOne {
    //Declare two instance value
    int a = 10;
    int b = 20;

    //Declare one instance variable
    //Call both instance variable into instance method inside the print statement
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //Declare the Main method
    //Call the above instance method into the main method and run the program
    public static void main(String[] args){
        ProgrammeOne qwe = new ProgrammeOne();
        qwe.instanceMethod();
    }

}

