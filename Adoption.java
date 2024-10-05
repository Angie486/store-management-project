public class Adoption extends PetService {
 // Instance Variables
  private double age;
private String color;
private int totalNumOfAnimals;
// Constructor Methods
  //No-Argument
  /*
  * This gives Adoption default settings if the user
  * doesn't input anything
  */
  public Adoption() {
    this(50.25, 6.5, "black", 52, true, "Pet Adoption");
  }

  // Parameterize
   /*
  * This allows it so that the user can input their own 
  * information, so it doesn't have to be default
  */
  public Adoption(double price, double age, String color, int totalNumOfAnimals, boolean isOpen, String service) {
    super(service, "unknown", true, price);
    this.age = age;
    this.color = color;
    this.totalNumOfAnimals = totalNumOfAnimals;
  }
// Accessor and Mutator Methods
  /*
  * This allows other classes to get the age
  * variable, returning the age from this class.
  */
public double getAge() {
  return age;
}
 /*
  * This allows other classes to get the color
  * variable, returning the color from this class.
  */
public String getColor() {
  return color;
}
 /*
  * This allows other classes to get the totalNumOfAnimals
  * variable, returning the total number of animals from this class.
  */
public int getTotalNumOfAnimals(int totalNumOfAnimals) {
  return totalNumOfAnimals;
}
/*
  * This sets the age, which is used in the
  * storeRunner so that it can output the age.
  */
 public void setAge(double age) {
    this.age = age;
  }
/*
  * This sets the color, which is used in the
  * storeRunner so that it can output the color.
  */
 public void setColor(String color) {
    this.color = color;
  }
/*
  * This sets the totalNumOfAnimals, which is used in the
  * storeRunner so that it can output the total number of animals.
  */
 public void setTotalNumOfAnimals(int totalNumOfAnimals) {
    this.totalNumOfAnimals = totalNumOfAnimals;
  }
 /*
  * This works so that the output could be more organized and 
  * so that you do not have to do each variable individually 
  * in the StoreRunner.
  */
// toString Method Override
public String toString() {
  return "\nAge: " + age + "\nColor: " + color + "\nTotal Numer of Animals: " + getTotalNumOfAnimals(totalNumOfAnimals - 1) + "\nPrice: " + getPrice(age*10);
}
  
}