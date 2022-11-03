/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor for cafe class
     * @param name
     * @param address
     * @param nFloors
     */
    public Cafe(String name, String address, int nFloors ) {
        super(name, address, nFloors); // Call the parent constructor
        this.nCoffeeOunces = 2000;
        this.nSugarPackets = 500;
        this.nCreams = 200 ;
        this.nCups = 150;
    }
    /**
     * Sells coffee to customers by removing products from inventory
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1;
    }
    /**
     * Restocks the store by adding produce to the stock
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    public static void main(String[] args) {
        Cafe compassCafe= new Cafe("Compass Cafe","Neilson Drive",1);
        compassCafe.sellCoffee(12, 3, 2);
        compassCafe.restock(12, 3, 2, 1);
    }
    
}

