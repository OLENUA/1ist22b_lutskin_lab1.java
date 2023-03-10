public class Kolo implements Shape{
    private int R = 0;
    private int X = 0;
    private int Y = 0;
    public Kolo(int Radius,int x, int y) {
        R = Radius;
        X = x;
        Y = y;
    }

    public void hellow(){
        System.out.println("Я коло з радіусом "+R+"см");
    }
}
