import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/features/"},
        format = {
                "pretty"
        },
        monochrome = true

)

public class RunCheckTest {

}
