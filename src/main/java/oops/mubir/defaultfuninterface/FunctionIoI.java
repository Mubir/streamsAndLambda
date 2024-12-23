package oops.mubir.defaultfuninterface;

import java.util.function.Function;

/**
 * Function<? super T, ? extends U> keyExtractor
 * keyExtractor is a Function (from java.util.function) that extracts a value of type
 * U from an object of type T.
 * For example, if T is Person and U is String, the keyExtractor could be a function
 * like Person::getName, which extracts the name of a person.
 * <p>
 * The type bounds ? super T and ? extends U:
 * ? super T: The function can take T or any of its superclasses as input.
 * ? extends U: The function can return U or any of its subclasses as output.
 */
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
