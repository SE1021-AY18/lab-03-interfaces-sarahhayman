/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

public class SheetMetal implements Part{


    public static double LBS_MULTIPLIER = 0.1;      //read only

    private double lengthInches;

    private double thicknessInches;

    private static double USD_MULTIPLIER = 0.50;

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

        StringBuilder builder = new StringBuilder();

        builder.append("==========================\n");
        builder.append(getName());
        builder.append("==========================\n");
        builder.append("Length: " + lengthInches + " inches\n");
        builder.append("Width: " + widthInches + " inches\n");
        builder.append("Thickness: " + thicknessInches + " inches\n");
        builder.append("Cost: $" + getCost() + "\n");
        builder.append("Weight: " + getWeight() + " lbs\n");

        System.out.println(builder.toString());


    }

}
