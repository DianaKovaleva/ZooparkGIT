import org.testng.annotations.BeforeGroups;

public class BeforeGroupsTest {

    @BeforeGroups("positive")
        public void BeforePositive() {
        System.out.println("Сейчас будут позитивные тесты");
    }

    @BeforeGroups("negative")
    public void BeforeNegative() {
        System.out.println("Сейчас будут негативные тесты");
    }


}
