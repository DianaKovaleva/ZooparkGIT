import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Я комментарий для GIT

    public static void main(String[] args) throws IOException {

        ArrayList<String> animalsList = FileHelper.readFromFile("ZooInfo.txt");
        ArrayList<String> animalsFacts = FileHelper.readFromFile("ZooFacts.txt");

        //Я комментарий для GIT номер 2

        Animals animal1 = new Animals(1, animalsList.get(0), animalsFacts.get(0));
        Animals animal2 = new Animals(2,animalsList.get(1), animalsFacts.get(1));
        Animals animal3 = new Animals(3,animalsList.get(2), animalsFacts.get(2));
        Birds bird1 = new Birds(1,animalsList.get(3), animalsFacts.get(3));
        Birds bird2 = new Birds(2,animalsList.get(4), animalsFacts.get(4));
        Birds bird3 = new Birds(3,animalsList.get(5), animalsFacts.get(5));
        Fishes fish1 = new Fishes(1, animalsList.get(6), animalsFacts.get(6));
        Fishes fish2 = new Fishes(2, animalsList.get(7), animalsFacts.get(7));
        Fishes fish3 = new Fishes(3, animalsList.get(8), animalsFacts.get(8));


        Scanner scanner;
        int num;
        do {
            System.out.println("\nПредложенный перечень существ: \n1. Животные \n2. Птицы  \n3. Рыбы \nВведите номер, " +
                    "чтобы получить список из (либо введите два нуля, чтобы выйти): ");
            scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    FirstOutput.FirstOutput(animal1.number, animal1.name, animal2.number, animal2.name, animal3.number, animal3.name);
                    break;
                case 2:
                    FirstOutput.FirstOutput(bird1.number, bird1.name, bird2.number, bird2.name, bird3.number, bird3.name);
                    break;
                case 3:
                    FirstOutput.FirstOutput(fish1.number, fish1.name, fish2.number, fish2.name, fish3.number, fish3.name);
                    break;
            }

            int num2 = scanner.nextInt();

            if (num == 1) {
                switch (num2) {
                    case 1:
                        System.out.println("Я " + animal1.name);
                        animal1.printInfoMove();
                        animal1.printInfoBreathe();
                        System.out.println(animal1.fact);
                        break;
                    case 2:
                        System.out.println("Я " + animal2.name);
                        animal2.printInfoMove();
                        animal2.printInfoBreathe();
                        System.out.println(animal2.fact);
                        break;
                    case 3:
                        System.out.println("Я " + animal3.name);
                        animal3.printInfoMove();
                        animal3.printInfoBreathe();
                        System.out.println(animal3.fact);
                        break;
                }
            } else if (num == 2) {
                switch (num2) {
                    case 1:
                        System.out.println("Я " + bird1.name);
                        bird1.printInfoMove();
                        bird1.printInfoBreathe();
                        System.out.println(bird1.fact);
                        break;
                    case 2:
                        System.out.println("Я " + bird2.name);
                        bird2.printInfoMove();
                        bird2.printInfoBreathe();
                        System.out.println(bird2.fact);
                        break;
                    case 3:
                        System.out.println("Я " + bird3.name);
                        bird3.printInfoMove();
                        bird3.printInfoBreathe();
                        System.out.println(bird3.fact);
                        break;
                }
            } else if (num == 3) {
                switch (num2) {
                    case 1:
                        System.out.println("Я " + fish1.name);
                        fish1.printInfoMove();
                        fish1.printInfoBreathe();
                        System.out.println(fish1.fact);
                        break;
                    case 2:
                        System.out.println("Я " + fish2.name);
                        fish2.printInfoMove();
                        fish2.printInfoBreathe();
                        System.out.println(fish2.fact);
                        break;
                    case 3:
                        System.out.println("Я " + fish3.name);
                        fish3.printInfoMove();
                        fish3.printInfoBreathe();
                        System.out.println(fish3.fact);
                        break;
                }
            }
        } while (num != 0);
        System.out.println("Перечень всех существ был таков: " + animalsList);
        FileHelper.writeToFile("ZooWriter.txt", "Спасибо за внимание!");

    }
}
