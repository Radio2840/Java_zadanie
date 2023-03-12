public class Circle implements Figure {
    private double r;
    private final double pi =3.14;
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPermiter() {
        return 2*pi*r;
    }

    @Override
    public double getArea() {
        return pi*Math.pow(r,2);
    }
    public String simpleName(){
        return "Circle";
    }
}
