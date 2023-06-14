public class lesson8 {

    public static void main(String[] args) {
        int var1 = 5;
        double var2 = 5.65;
        aircraft cesna172 = new aircraft(4,140,56.5,9.5);
        aircraft piperSarotoga = new aircraft(6,201,102.5,20.4);

        
        System.out.println("for cesna172 to fly for 4.2hrs it takes " + cesna172.fuelNeeded(4.2) + "gallons of fuel.");
        System.out.println("\nfor piper saratoga to fly for 4.2hrs it takes " + piperSarotoga.fuelNeeded(4.2) + "gallons of fuel.");


    }
}