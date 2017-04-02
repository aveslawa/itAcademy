package company;

public class Producer extends Thread implements Runnable {
    private Robot robot;
    private int timeout;

    Producer(Robot robot, int timeout) {
        this.robot = robot;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        try {
            while (timeout > 0) {
                robot.put();
                sleep(100);
                timeout = timeout - 100;
            }
        } catch (InterruptedException e) {
            System.out.print("something went wrong");
        }
    }
}
