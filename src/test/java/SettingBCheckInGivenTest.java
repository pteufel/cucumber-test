import cucumber.api.java8.En;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SettingBCheckInGivenTest implements En {

    World world;

    public SettingBCheckInGivenTest(World world) {
        this.world = world;

        Given("^BCheck$", () -> {
            this.world.setCheck(new BCheck());
        });

        Then("^BCheck is set$", () -> {
            assertThat(this.world.getCheck(), instanceOf(BCheck.class));
        });

    }

}
