public class Kvadrat implements Shape{
    private int A = 0;

    public Kvadrat(int a) {
        A = a;
    }

    public void hellow(){
        System.out.println("Я квадрат з стороною "+ A+" см");
    }
}
