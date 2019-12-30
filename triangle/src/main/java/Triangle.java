class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (isTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    boolean isScalene() {
        return side1 != side2 && side2 != side3;
    }

    private boolean isTriangle(double side1, double side2, double side3) {
        if ((side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 >= side3 && side1 + side3 >= side2 && side2 + side3 >= side1)) {
            return true;
        } else {
            return false;
        }
    }

}
