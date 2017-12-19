/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

public class Nut implements Part{

    private double diameterInches;

    public static double LBS_MULTIPLIER = 0.01;   //read only
    public static double USD_MULTIPLIER = 0.5;    //read only

    public double getCost(){

    return (USD_MULTIPLIER * diameterInches);

    }

    public String getName(){

        return(diameterInches + " inch nut");

    }

    public double getWeight(){

    return(LBS_MULTIPLIER * diameterInches);    //Correct formula??

    }

    public void printBillOfMaterials(){

        StringBuilder builder = new StringBuilder();

        builder.append("==========================\n");
        builder.append(diameterInches + " inch nut\n");
        builder.append("==========================\n");
        builder.append("Diameter: " + diameterInches + " inches\n");
        builder.append("Cost: $" + getCost() + "\n");
        builder.append("Weight: " + getWeight() + " lbs");

        System.out.println(builder.toString());

    }

}
