package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        DuckBehavior donaldDuck = new Duck();
        DuckBehavior electricDuck = new ElectronicDuck();

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckBehavior... ducks)
    {
        for (DuckBehavior duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckBehavior... ducks)
    {
        for (DuckBehavior duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        new Pool().run();
    }
}
