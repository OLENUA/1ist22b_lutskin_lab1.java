public class Pramokut implements Shape{
    private int weight = 0;
    private int height = 0 ;

    public Pramokut(int w, int h) {
        this.weight = w;
        this.height = h;
    }

    public void hellow(){
        System.out.println("Я прямокутник  з сторонами "+weight+" на "+height);
    }
}
