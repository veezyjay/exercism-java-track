class Darts {

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double distanceToDart = Math.sqrt(x * x + y * y);
        int result = 10;
        if (distanceToDart > 10) {
            result = 0;
        } else if (distanceToDart > 5) {
            result = 1;
        } else if (distanceToDart > 1) {
            result = 5;
        }

        return result;
        
    }

}
