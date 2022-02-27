public class Animals {
    int number;
    String name;
    String fact;
    static String move = "лапы/ноги";
    static String breathe = "кислород из воздуха";

    public Animals (int number, String name, String fact) {
        this.number = number;
        this.name = name;
        this.fact = fact;
    }

    public static String printInfoMove() {
        String stringMove = "Я передвигаюсь, используя " + move;
        System.out.println("Я передвигаюсь, используя " + move);
        return stringMove;
    }

    public static String printInfoBreathe() {
        String stringBreathe = "Мне нужен " + breathe + " для дыхания";
        System.out.println("Мне нужен " + breathe + " для дыхания");
        return stringBreathe;
    }



}
