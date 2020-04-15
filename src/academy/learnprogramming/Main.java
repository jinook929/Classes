package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car carrera = new Car();

        porsche.setModel("911");
        System.out.println(porsche.getModel());
        System.out.println("Model is " + porsche.getModel());
        System.out.println(carrera.getModel());
        carrera.setModel("Carrera");
        System.out.println(carrera.getModel());
        System.out.println("Model is " + carrera.getModel());
    }
}
