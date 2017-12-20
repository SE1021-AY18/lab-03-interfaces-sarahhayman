/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;

public class Bolt implements Part{

    private double diameterInches;

    public static final double LBS_MULTIPLIER = 0.05;        //read only

    private double lengthInches;

    public static final double USD_MULTIPLIER = 1.00;        //read only

    public Bolt(double diameterInches, double lengthInches){    //Constructor

        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    public double getCost(){

    return (USD_MULTIPLIER * diameterInches * lengthInches);

    }

    public String getName(){

    return (diameterInches + "x" + lengthInches + " bolt");

    }

    public double getWeight(){

    return (LBS_MULTIPLIER * diameterInches * diameterInches * lengthInches);

    }

    public void printBillOfMaterials(){

        DecimalFormat costFormat = new DecimalFormat("#0.00");
        DecimalFormat weightFormat = new DecimalFormat(("##.###"));
        DecimalFormat diameterFormat = new DecimalFormat(("##.##"));

        StringBuilder builder = new StringBuilder();

        builder.append("==========================\n");
        builder.append(getName() + "\n");
        builder.append("==========================\n");
        builder.append("Diameter: " + diameterFormat.format(diameterInches) + " inches\n");
        builder.append("Length: " + lengthInches + " inches\n");
        builder.append("Cost: $" + costFormat.format(getCost()) + "\n");
        builder.append("Weight: " + weightFormat.format(getWeight()) + " lbs\n");

        System.out.println(builder.toString());

    }


}
