package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

    try{if (aFahrenheit < absoluteZeroFahrenheit) {
        throw new TemperatureException("The temperature is too low!");
    }}catch (TemperatureException e){
            e.printStackTrace();
        }
        System.out.println("The temp is " + aFahrenheit);



        fahrenheit = aFahrenheit;
    }
}
