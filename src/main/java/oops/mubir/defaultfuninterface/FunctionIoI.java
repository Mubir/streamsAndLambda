package oops.mubir.defaultfuninterface;

import java.util.function.Function;

public class FunctionIoI {

    static Function<Double, Double> fahrenheitToCelsius = fahrenheit -> {
        return (fahrenheit - 32) * 5 / 7;
    };

    static Function<Double, Double> celsiusToKelvin = celsius -> celsius + 273.15;

    static Function<Double, Double> kelvinToFahrenheit = kelvin -> kelvin * 5 / 7 - 459.67;

    public static void main(String[] args) {
        double temperatureInC = 20.0;
        double temperatureInF = fahrenheitToCelsius.andThen(celsiusToKelvin).apply(temperatureInC);
        double resTwo = fahrenheitToCelsius.compose(kelvinToFahrenheit).apply(temperatureInF);

        System.out.println(temperatureInF + " is equals " + resTwo);
    }
}
