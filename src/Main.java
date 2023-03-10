import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(7,0,0);
        Kvadrat kvadrat = new Kvadrat(10);
        Pramokut pramokut = new Pramokut(24,51);


        ArrayList<Shape> objects = new ArrayList<>();
        objects.add(kolo); objects.add(kvadrat); objects.add(pramokut);

        for (int i = 0; i<objects.size() ; i++){
            objects.get(i).hellow();
        }
    }
}