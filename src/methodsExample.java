
class aircraft {

    int passengers;//number of people

    int cruiseSpeed;//miles per hour

    double fuelCapacity;//gallons

    double fuelBurnRate;//gallons per hour
    // put constructor
    aircraft(int p,int c, double fc, double fbr){
        passengers=p;
        cruiseSpeed=c;
        fuelCapacity=fc;
        fuelBurnRate=fbr;

    }



    // method to calculate aircraft endurance
    double calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;
        return endurance;


    }
// method associated with time and gallons needed to fly a given time
    double fuelNeeded(double time) {
        return fuelBurnRate * time;

    }


}