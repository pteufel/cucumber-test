import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SettingBCheckInBeforeTest implements En {

    World world;

    public SettingBCheckInBeforeTest(World world) {
        this.world = world;

        Before(() -> {
            this.world.setCheck(new BCheck());
        });

    }
}