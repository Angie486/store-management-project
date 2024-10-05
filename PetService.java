public class PetService {
  // Instance Variables
private String service;
  private String name;
  private boolean isOpen;
  private double price;
  // Constructor Methods
  //No-Argument
  /*
  * This gives PetService default settings if the user
  * doesn't input anything
  */
public PetService() {
  this("none", "unknown", true, 25.50);
}
  // Parameterize
  /*
  * This allows it so that the user can input their own 
  * information, so it doesn't have to be default
  */
  public PetService(String service, String name, boolean isOpen, double price) {
    this.name = name;
    this.service = service;
    this.isOpen = isOpen;
    this.price = price;
  }
  // Accessor and Mutator Methods
  /*
  * This allows other classes to get the name
  * variable, returning the name from this class.
  */
public String getName() {
  return name;
}
  /*
  * This allows other classes to get the service
  * variable, returning the service from this class.
  */
  public String getService() {
  return service;
}
/*
  * This allows other classes to get the isOpen
  * variable, returning if it is open from this class.
  */
  public boolean getIsOpen() {
  return isOpen;
}
/*
  * This allows other classes to get the price
  * variable, returning the price from this class.
  */
  public double getPrice(double price) {
  return price;
}
/*
  * This sets the name, which is used in the
  * storeRunner so that it can output the name.
  */
  public void setName(String name) {
    this.name = name;
  }
/*
  * This sets the service, which is used in the
  * storeRunner so that it can output the service.
  */
  public void setService(String service) {
    this.service = service;
  }
/*
  * This sets the isOpen, which is used in the
  * storeRunner so that it can output if it is open.
  */
  public void setIsOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }
/*
  * This sets the price, which is used in the
  * storeRunner so that it can output the price.
  */
  public void setPrice(double price) {
    this.price = price;
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
  if(isOpen) {
    text += "Open";
  } else {
    text += "Not Open";
  }
  return "\nService: " + service + " (" + text + ")" + "\nName of Animal: " + name;
}


  // Other Methods
  
}