/*
* Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
długość promienia koła,
2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
długość boków prostokąta.
Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
* */


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
                System.out.println("Name: "+f.simpleName()+"Area: "+f.getArea()+" Permiter: "+f.getPermiter());
            }
        }


}