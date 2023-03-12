public class Triangle implements Figure {
    private double a;
    private  double b;

    public void setAB(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPermiter() {
        double c;
        c = Math.pow(a,2) + Math.pow(b,2);
        c = Math.sqrt(c);
        return a+b+c;
    }

    @Override
    public double getArea() {
        return (a*b)/2;
    }
    public String simpleName(){
        return "Triangle";
    }
}
