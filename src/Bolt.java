/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

public class Bolt implements Part{

    private double diameterInches;

    public static double LBS_MULTIPLIER = 0.05;        //read only

    private double lengthInches;

    public static double USD_MULTIPLIER = 1.00;        //read only

    public Bolt(double diameterInches, double lengthInches){    //Constructor

    }

    public double getCost(){

    return (USD_MULTIPLIER * diameterInches * lengthInches);

    }

    public String getName(){

    //return ();  //? todo

    }

    public double getWeight(){


    }

    public void printBillOfMaterials(){

    }


}
