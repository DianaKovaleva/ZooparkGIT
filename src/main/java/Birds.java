public class Birds extends MoveAndBreathe {
    int number;
    String name;
    String fact;
    String move = "крылья";
    String breathe = "кислород из воздуха";

    public Birds (int number, String name, String fact) {
        this.number = number;
        this.name = name;
        this.fact = fact;
    }

    @Override
    public void printInfoMove() {
        System.out.println("Я передвигаюсь, используя " + move);
    }

    @Override
    public void printInfoBreathe() {
        System.out.println("Мне нужен " + breathe + " для дыхания");
    }
}
