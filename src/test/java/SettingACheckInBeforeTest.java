import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SettingACheckInBeforeTest implements En {

    World world;

    public SettingACheckInBeforeTest(World world) {
        this.world = world;

        Before(() -> {
            this.world.setCheck(new ACheck());
        });
        Then("^ACheck is set$", () -> {
            assertThat(this.world.getCheck(), instanceOf(ACheck.class));
        });


    }
}
