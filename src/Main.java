public class Main {
    public static void main(String[] args) {
  Planets[] planets = Planets.values();
        for (Planets p :
                planets) {
            System.out.println(p + p.toString());
        }
    }
}