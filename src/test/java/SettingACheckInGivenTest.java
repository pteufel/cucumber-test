import cucumber.api.java8.En;

public class SettingACheckInGivenTest implements En {

    World world;

    public SettingACheckInGivenTest(World world) {

        this.world = world;

        Given("^ACheck$", () -> {
            this.world.setCheck(new ACheck());
        });

    }

}
