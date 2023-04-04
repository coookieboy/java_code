package design.composite;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable duckCounter = new QuackCounter(new DuckCall());
        Quackable mallardDuckCounter = new QuackCounter(new MallardDuck());
        Quackable redheadDuckCounter = new QuackCounter(new RedheadDuck());
        Quackable rubberDuckCounter = new QuackCounter(new RubberDuck());
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        simulate(duckCounter);
        simulate(mallardDuckCounter);
        simulate(redheadDuckCounter);
        simulate(rubberDuckCounter);
        simulate(gooseAdapter);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
