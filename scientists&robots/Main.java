package company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Robot robot = new Robot();
        robot.initialFill();
        new Thread(new Producer(robot, 10000)).start();
        Consumer vasya = new Consumer(robot, 10000, "Vasya");
        new Thread(vasya).start();
        Consumer petya = new Consumer(robot, 10000, "Petya");
        new Thread(petya).start();
        Thread.currentThread().join(10500);
        System.out.println(vasya.getRobots() > petya.getRobots() ? "Scientist Vasya wins!" : "Scientist Petya Wins!");
    }
}
