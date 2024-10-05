import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    //This outputs the superclass PetService
    PetService ps = new PetService();
//This determines what type of service they want
    System.out.println("Welcome to the Pet Center! What service are you here for?");
    System.out.println("1. Pet Spa");
    System.out.println("2. Pet Adoption");
int serviceType = input.nextInt();
    String serviceString = "Pet Adoption";
    if (serviceType == 1) {
      serviceString = "Pet Spa";
    }
/*This is so that the name of their animal can be gotten,
* but if they are adopting, it isn't the name of the animal, 
* it is what they want the animals name to be, still in the superclass.
*/
    if (serviceType == 1) {
       System.out.println("What is the name of your animal?");
    String userAnimal = input.next();
       ps.setName(userAnimal);
    } else if (serviceType == 2) {
       System.out.println("What would you like the animals name to be?");
    String userChosenName = input.next();
       ps.setName(userChosenName);
    }

    ps.setService(serviceString);

    /* 
     * This declares the petSpa and Adoption subclasses
     */
    PetSpa psp = new PetSpa();
    Adoption pa = new Adoption();

    /* 
     * This if else statements purpose is so that if they picked the pet spa
     * or pet adoption that the questions outputted would relate to whatever
     * is in that subclass.
     */
    if (serviceType == 1) {
       System.out.println("Do you have an appointment?");
        System.out.println("1. Yes");
    System.out.println("2. No");
      int appointmentType = input.nextInt();
       boolean appointmentBoolean = false;
    if (appointmentType == 1) {
      appointmentBoolean = true;
    }
      psp.setHasAppointment(appointmentBoolean);
      System.out.println("What is the weight of your animal?");
      double userWeight = input.nextDouble();
       psp.setWeight(userWeight);
      System.out.println("What is your animals fur type?");
        String userFurType = input.next();
       psp.setFurType(userFurType);
      System.out.println(ps);
    System.out.println(psp);
    } else if (serviceType == 2) {
      System.out.println("What age do you want your animal to be?");
      double userAge = input.nextDouble();
       pa.setAge(userAge);
      System.out.println("What color would you like your animal to be?");
        String userColor = input.next();
       pa.setColor(userColor);
      System.out.println(ps);
    System.out.println(pa);
    }
     


    // Closes the Scanner object
    input.close();
    
  }
}