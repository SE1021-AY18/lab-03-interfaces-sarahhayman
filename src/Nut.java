/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;

public class Nut implements Part{

    private double diameterInches;

    public static final double LBS_MULTIPLIER = 0.01;   //read only
    public static final double USD_MULTIPLIER = 0.5;    //read only

    public Nut(double diameterInches){
        this.diameterInches = diameterInches;

    }

    public double getCost(){

    return (USD_MULTIPLIER * diameterInches);

    }

    public String getName(){

        return(diameterInches + " inch nut\n");

    }

    public double getWeight(){

    return(LBS_MULTIPLIER * diameterInches * diameterInches);

    }

    public void printBillOfMaterials(){

        DecimalFormat costFormat = new DecimalFormat("#0.00");
        DecimalFormat weightFormat = new DecimalFormat(("##.###"));

        StringBuilder builder = new StringBuilder();

        builder.append("==========================\n");
        builder.append(getName());
        builder.append("==========================\n");
        builder.append("Diameter: " + diameterInches + " inches\n");
        builder.append("Cost: $" + costFormat.format(getCost()) + "\n");
        builder.append("Weight: " + weightFormat.format(getWeight()) + " lbs\n");

        System.out.println(builder.toString());

    }

}
