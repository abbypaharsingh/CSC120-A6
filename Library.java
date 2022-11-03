import java.util.Hashtable;
import java.util.Set;

/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection= new Hashtable <String, Boolean>();

  /**
   * Constructor for the library class
   * @param name
   * @param address
   * @param nFloors
   */
    public Library(String name, String address, int nFloors ) {
      super(name, address, nFloors); // Call the parent constructor
    
    }
    
    /**
     * Adds book to collection
     * @param title
     */
    public void addTitle(String title){
      this.collection.put(title,true);
    }
    
    /**
     * Removes book from Collection
     * @param title
     * @return
     */
    public String removeTitle(String title){ // return the title that we removed
       this.collection.remove(title);  
       return title; 
    } 
    
    /**
     * Checks out book from library
     * @param title
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false);
    }
    
    /**
     * Returns book to library
     * @param title
     */
    public void returnBook(String title){
      this.collection.replace(title, false, true);
    }
    /**
     * Checks if the title appears as a key in the Libary's collection
     * @param title
     * @return boolean
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
  } 
  /**
   * Checks if book is currenly available in library
   * @param title
   * @return boolean
   */
    public boolean isAvailable(String title){
          return this.collection.get(title);
    }

    /**
     * Prints out the entire collection in an easy-to-read way (including checkout status)
    */
    public void printCollection(){ 
         //for loop 
         Set<String> setOfKeys = this.collection.keySet();
         for (String key : setOfKeys){
            System.out.print(key + " is ");
            if(this.collection.get(key)== true){
              System.out.print("available.");
              System.out.println();
          }
          else{
            System.out.println("checked out.");
            System.out.println();
          }
         }
         
    }
    
    public static void main(String[] args) {
      Library neilsonLibrary= new Library("Neilson", "Neilson Drive", 5);
      neilsonLibrary.addTitle("Circe by Madeline Miller");
      neilsonLibrary.addTitle("Educated by Tara Westover");
      neilsonLibrary.addTitle("The Color Purple by Alice Walker");
      neilsonLibrary.printCollection();
      neilsonLibrary.checkOut("Circe by Madeline Miller");
      neilsonLibrary.printCollection();
      neilsonLibrary.returnBook("Circe by Madeline Miller");
      neilsonLibrary.printCollection();
    }
  
  }