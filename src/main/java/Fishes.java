public class Fishes {
    int number;
    String name;
    String fact;
    String move = "плавники";
    String breathe = "кислород из воды";

    public Fishes (int number, String name, String fact) {
        this.number = number;
        this.name = name;
        this.fact = fact;
    }

    public void printInfoMove() {
        System.out.println("Я передвигаюсь, используя " + move);
    }

    public void printInfoBreathe() {
        System.out.println("Мне нужен " + breathe + " для дыхания");
    }
}
