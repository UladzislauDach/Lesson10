public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0);
        robot.setX(100500);
        robot.setY(-12345);
        System.out.println(robot.getX());
        robot.setX(2);
        robot.setY(3);
    }
}
