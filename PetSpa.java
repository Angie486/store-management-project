public class PetSpa extends PetService {
 // Instance Variables
private double weight;
private String furType;
private boolean hasAppointment;
 // Constructor Methods
  //No-Argument
  /*
  * This gives PetSpa default settings if the user
  * doesn't input anything
  */
  public PetSpa() {
    this(50.25, 5.05, "fluffy", true, "Pet Spa");
  }

  // Parameterize
  /*
  * This allows it so that the user can input their own 
  * information, so it doesn't have to be default
  */
  public PetSpa(double price, double weight, String furType, boolean hasAppointment, String service) {
    super(service, "unknown", true, price);
    this.weight = weight;
    this.furType = furType;
    this.hasAppointment = hasAppointment;
  }
  // Accessor and Mutator Methods
  /*
  * This allows other classes to get the weight
  * variable, returning the weight from this class.
  */
public double getWeight() {
  return weight;
}
/*
  * This allows other classes to get the furType
  * variable, returning the fur type from this class.
  */
public String getFurType() {
  return furType;
}
/*
  * This allows other classes to get the hasAppointment
  * variable, returning if the user has an appointment 
  * from this class.
  */
public boolean getHasAppointment() {
  return hasAppointment;
}
/*
  * This sets the weight, which is used in the
  * storeRunner so that it can output the weight.
  */
 public void setWeight(double weight) {
    this.weight = weight;
  }
/*
  * This sets the furType, which is used in the
  * storeRunner so that it can output the fur type.
  */
 public void setFurType(String furType) {
    this.furType = furType;
  }
/*
  * This sets the hasAppointment, which is used in the
  * storeRunner so that it can output if the user has an appointment.
  */
 public void setHasAppointment(boolean hasAppointment) {
    this.hasAppointment = hasAppointment;
  }
   /*
  * This works so that the output could be more organized and 
  * so that you do not have to do it in the StoreRunner. The if
  * statement is so that it can output whatever is chosen for the 
  * boolean method.
  */
// toString Method Override
public String toString() {
  String text = "";
  if(hasAppointment) {
    text += "Yes";
  } else {
    text += "No";
  }
  return "\nHas Appointment? " + text + "\nWeight: " + weight + "\nFur Type: " + furType + "\nPrice: " + getPrice(weight*3);
}
  
}