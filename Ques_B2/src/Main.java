import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Point location = new Point(0,0);
        Robot robot = new Robot("E", location);

        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        System.out.println(robot.getDirection());
        System.out.println(robot.getLocation().x + " " + robot.getLocation().y);

    }
}
