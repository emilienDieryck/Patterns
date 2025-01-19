public class FactoryGrosseBerta implements AbstractFactory {

    @Override
    public Robot createRobot() {
        return new RobotBuilder.Builder().setCanon(100).setSchield(100).setFreq(100).setLife(10).setName("GrosseBerta").build();
    }
}
