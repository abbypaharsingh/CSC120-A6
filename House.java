import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
 
/**
 * Constructor for the House Class
 * @param name
 * @param address
 * @param nFloors
 */
  public House(String name, String address, int nFloors,boolean hasDiningRoom  ) {
    super(name, address, nFloors); // Call the parent constructor
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = true;
  //   if (hasDiningRoom == false) {
  //     System.out.println("This house does not have a dining room");
  // }
  //  else{
  //   System.out.println("This house has a dining room");
  //  }
  }

  /**
   * Tells user whether house has a dining room or not.
   * @return boolean
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
}
/**
 * Tells user the number of residents in the house.
 * @return int
 */
  public int nResidents() {
    return this.residents.size();
}
/**
 * Adds a residents name to the list when they move in to the house.
 * @param name
 */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /**
   * Removes the name of the person who moved out and returns it.
   * @param name
   * @return String
   */
  public String moveOut(String name){ 
    this.residents.remove(name);
    return name;
    
  } 
  
  /**
   * Tells user if the person they are looking for lives in that house.
   * @param person
   * @return boolean
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
  }
  public static void main(String[] args) {
     House hopkinsHouse = new House("Hopkins", "Elm Street",3, false);
     hopkinsHouse.moveIn("Abby");
     hopkinsHouse.moveIn("Sena");
     hopkinsHouse.moveIn("Anna");
     System.out.println(hopkinsHouse.nResidents());
     hopkinsHouse.moveOut("Anna");
     System.out.println(hopkinsHouse.isResident("Abby"));
     System.out.println(hopkinsHouse.isResident("Maria"));
     System.out.println(hopkinsHouse.nResidents());
     

     
  }

}