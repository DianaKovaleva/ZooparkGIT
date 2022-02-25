public class Animals extends MoveAndBreathe{
    int number;
    String name;
    String fact;
    String move = "лапы/ноги";
    String breathe = "кислород из воздуха";

    public Animals (int number, String name, String fact) {
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
