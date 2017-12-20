/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;

public class SheetMetal implements Part{


    public static final double LBS_MULTIPLIER = 0.1;      //read only

    private double lengthInches;

    private double thicknessInches;

    private static final double USD_MULTIPLIER = 0.50;

    private double widthInches;



    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){  //Constructor
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

    public double getCost(){

    return (USD_MULTIPLIER * thicknessInches * widthInches * lengthInches);

    }

    public String getName(){

        return (lengthInches + "x" + widthInches + "x" + thicknessInches + " sheet");

    }

    public double getWeight(){

        return (LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches);

    }

    public void printBillOfMaterials(){

        DecimalFormat costFormat = new DecimalFormat("#0.00");
        DecimalFormat weightFormat = new DecimalFormat(("##.###"));

        StringBuilder builder = new StringBuilder();

        builder.append("==========================\n");
        builder.append(getName() + "\n");
        builder.append("==========================\n");
        builder.append("Length: " + lengthInches + " inches\n");
        builder.append("Width: " + widthInches + " inches\n");
        builder.append("Thickness: " + thicknessInches + " inches\n");
        builder.append("Cost: $" + costFormat.format(getCost()) + "\n");
        builder.append("Weight: " + weightFormat.format(getWeight()) + " lbs\n");

        System.out.println(builder.toString());


    }

}
