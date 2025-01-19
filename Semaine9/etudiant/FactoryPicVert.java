public class FactoryPicVert implements AbstractFactory {

        @Override
        public Robot createRobot() {
            return new RobotBuilder.Builder().setCanon(10).setSchield(10).setFreq(10).setLife(100).setName("PicVert").build();
        }
}
