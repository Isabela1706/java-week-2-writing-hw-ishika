package javaweek2writinghwishika;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class ProgrammeThree {
    //Declare one instance and one static
    String name = "Prime";
    static String surname = "Testing";

    //Declare one instance method
    //Call both instance and static methods inside the print statement
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(ProgrammeThree.surname);
    }
    //Declare one static method
    //Call both instance and static methods inside the print statement
    public static void staticMethod(){
        ProgrammeThree obj = new ProgrammeThree();
        System.out.println(obj.name);
        System.out.println(surname);

    }
    //Declare the main method
    //Call both instance and static methods inside and run statement

    public static void main(String[] args) {
        ProgrammeThree nav = new ProgrammeThree();
        nav.instanceMethod();
        staticMethod();

    }

}
