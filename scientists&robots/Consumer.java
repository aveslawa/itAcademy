package company;

public class Consumer extends Thread implements Runnable {
    private Robot resultParts;
    private Robot robot;
    private int timeout;
    private int robots;
    private String name;

    public int getRobots() {
        return robots;
    }


    Consumer(Robot robot, int timeout, String name) {
        this.robot = robot;
        this.timeout = timeout;
        resultParts = new Robot();
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (timeout > 0) {
                robot.get().parts.forEach((key, value) -> {
                    resultParts.parts.put(key, resultParts.parts.get(key) + value);
                });
                sleep(100);
                timeout = timeout - 100;
            }
        } catch (InterruptedException e) {
            System.out.print("something went wrong");
        }
        System.out.println(name + " " + resultParts.parts.values().stream().min(Integer::compareTo).get());
        robots = resultParts.parts.values().stream().min(Integer::compareTo).get();
    }
}
