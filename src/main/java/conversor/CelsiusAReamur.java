package conversor;

public class CelsiusAReamur implements ConversorDesdeCelsius {
    @Override
    public double covierteDesdeCelsius(double celsius) {
        return 4.0/5.0 * celsius;
    }
}
