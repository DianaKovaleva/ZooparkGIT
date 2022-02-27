import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import static org.testng.Assert.*;
public class MainClassPositiveTest extends BeforeGroupsTest{

    @Test(groups = "positive")
    public void CheckBreatheMessage() {
       String actualAnimalBreath = Animals.printInfoBreathe();
       String expectedAnimalBreath = "Мне нужен кислород из воздуха для дыхания";
       assertEquals(actualAnimalBreath, expectedAnimalBreath);
    }

    @Test(groups = "positive")
    public void CheckMoveMessage() {
        String actualAnimalMove = Animals.printInfoMove();
        String expectedAnimalMove = "я передвигаюсь, используя лапы/ноги";
        assertTrue(actualAnimalMove.equalsIgnoreCase(expectedAnimalMove), String.format("Actual: %s, Expected: %s",
                actualAnimalMove, expectedAnimalMove));
    }

    @Test(groups = "positive")
    public void CheckCreaturesArray() throws FileNotFoundException {
        ArrayList<String> creaturesList = FileHelper.readFromFile("ZooInfo.txt");
        ArrayList<String> expectedCreaturesList = new ArrayList<>();
        expectedCreaturesList.add("Слон");
        expectedCreaturesList.add("Жираф");
        expectedCreaturesList.add("Кенгуру");
        expectedCreaturesList.add("Попугай");
        expectedCreaturesList.add("Колибри");
        expectedCreaturesList.add("Пиранья");
        expectedCreaturesList.add("Карп");
        expectedCreaturesList.add("Сова");
        expectedCreaturesList.add("Рыба-пила");

        int listSize = creaturesList.size();
        if (listSize != 9) {
            fail("Кого-то потеряли!");
        }
        assertEquals(creaturesList,expectedCreaturesList); //этот тест не пройдет, так поменяла местами элементы
        assertEqualsNoOrder(creaturesList,expectedCreaturesList); //этот тест пройдет

    }


}