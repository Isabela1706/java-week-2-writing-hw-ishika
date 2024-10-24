package javaweek2writinghwishika;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class ProgrammeFour {

    //Declare two instance and two static
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //Declare one instance method.
    //Call all four instance and static variables into both instance and static methods inside the print statement.
     public void instanceMethod(){
         System.out.println(Name);
         System.out.println(Surname);
         System.out.println(ProgrammeFour.a);
         System.out.println(ProgrammeFour.b);
     }

    //Declare one static method.
    //Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod(){
         ProgrammeFour programmeFour = new ProgrammeFour();
        System.out.println(programmeFour.Name);
        System.out.println(programmeFour.Surname);
        System.out.println(a);
        System.out.println(b);
    }
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        ProgrammeFour programmeFour = new ProgrammeFour();
        programmeFour.instanceMethod();
        staticMethod();
    }


}
