import java.text.DecimalFormat;

class SpaceAge {
    private double seconds;
    private double earthYearSeconds;
    private DecimalFormat df;

    SpaceAge(double seconds) {
        this.seconds = seconds;
        this.earthYearSeconds = 365.25 * 24 * 60 * 60;
        this.df = new DecimalFormat("#.##");
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        double result = seconds / (earthYearSeconds * 1.0);
        return Double.valueOf(df.format(result));
    }

    double onMercury() {
        double result = seconds / (earthYearSeconds * 0.2408467);
        return Double.valueOf(df.format(result));
    }

    double onVenus() {
        double result = seconds / (earthYearSeconds * 0.61519726);
        return Double.valueOf(df.format(result));
    }

    double onMars() {
        double result = seconds / (earthYearSeconds * 1.8808158);
        return Double.valueOf(df.format(result));
    }

    double onJupiter() {
        double result = seconds / (earthYearSeconds * 11.862615);
        return Double.valueOf(df.format(result));
    }

    double onSaturn() {
        double result = seconds / (earthYearSeconds * 29.447498);
        return Double.valueOf(df.format(result));
    }

    double onUranus() {
        double result = seconds / (earthYearSeconds * 84.016846);
        return Double.valueOf(df.format(result));
    }

    double onNeptune() {
        double result = seconds / (earthYearSeconds * 164.79132);
        return Double.valueOf(df.format(result));
    }

}
