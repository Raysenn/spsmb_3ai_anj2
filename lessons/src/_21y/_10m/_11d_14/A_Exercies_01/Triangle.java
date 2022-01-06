package _21y._10m._11d_14.A_Exercies_01;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double side) {
        this(side, side, side);
    }

    public Triangle (double sideA, double sideC) {
        this(sideA, sideA, sideC);
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!this.isTriangle()) {
            this.sideA = 0;
            this.sideB = 0;
            this.sideC = 0;
        }
    }

    public double circumference() {
        return this.sideA + this.sideB + this.sideC;
    }

    public boolean isRightAngle() {
        return Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2);
    }

    public boolean isTriangle() {
        return this.sideA + this.sideB > this.sideC && this.sideA + this.sideC > this.sideB && this.sideB + this.sideC > this.sideA;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + this.sideA +
                ", sideB=" + this.sideB +
                ", sideC=" + this.sideC +
                '}';
    }
}
