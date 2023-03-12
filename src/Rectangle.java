public class Rectangle implements Figure {

    private double a;
    private double b;

    public void setAB(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPermiter() {
        return (a*2) + (b*2);
    }

    @Override
    public double getArea() {
        return a*b;
    }
    public String simpleName(){
        return "Rectangle";
    }


}
