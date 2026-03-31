/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements {

    // Attributes
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nCreams = nCreams;
        this.nSugarPackets = nSugarPackets;
        this.nCups = nCups;

        System.out.println("You have built a cafe: ☕");
    }

    // Methods

    /**
     * Reduces cafe's stock depending on what they sell
     * 
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >= 1){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        } else {
            throw new RuntimeException("Cafe does not in stock to sell this coffee.");
        }
    }

    /**
     * Increases the cafe's stock depending on how much of each parameter is delivered.
     * 
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
        Cafe compass = new Cafe("Compass Cafe", "100 Elm St", 1, 5,5,5,5);
        System.out.println(compass.getAddress());
    }
    
}
