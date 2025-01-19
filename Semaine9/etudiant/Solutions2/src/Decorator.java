public abstract class Decorator implements Robot {

    private  Robot robot;

    public Decorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public int getCanon() {
        return robot.getCanon();
    }

    @Override
    public int getShield() {
        return robot.getShield();
    }

    @Override
    public int getFreq() {
        return robot.getFreq();
    }

    @Override
    public String getName() {
        return robot.getName();
    }

    @Override
    public int diffLife(int i) {
        return robot.diffLife(i);
    }

    @Override
    public Robot clone() {
        try {
            Decorator cloned = (Decorator) super.clone();
            cloned.robot = this.robot.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
