import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"steps"},
        plugin = {"util.AllureReporter"},
        tags = {"@AllTests"}
)

public class CucumberRunner {
}
