
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        static List<Figure> figureList = new ArrayList<>();
        static Rectangle rectangle = new Rectangle();
        static Triangle triangle = new Triangle();

        static Circle circle = new Circle();
        static Scanner dane = new Scanner(System.in);

        public static void main(String[] args){
            System.out.println("Podaj dwa boki prostokata");
            rectangle.setAB(dane.nextDouble(),dane.nextDouble());
            figureList.add(rectangle);
            System.out.println("Podaj dwa boki trojkata prostokatnego");
            triangle.setAB(dane.nextDouble(),dane.nextDouble());
            figureList.add(triangle);
            System.out.println("Podaj promien kola");
            circle.setR(dane.nextDouble());
            figureList.add(circle);

            for(Figure f : figureList){
                System.out.println(f.simpleName()+" Area: "+f.getArea()+" Permiter: "+f.getPermiter());
            }
        }


}