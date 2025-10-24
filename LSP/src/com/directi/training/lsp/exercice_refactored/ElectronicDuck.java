package com.directi.training.lsp.exercise;

public class ElectronicDuck implements DuckBehavior
{
    private boolean _on = false;

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

    @Override
    public void quack()
    {
        if (!_on) {
            turnOn();  // ensure it's on before using
        }
        System.out.println("Electronic duck quack...");
    }

    @Override
    public void swim()
    {
        if (!_on) {
            turnOn();  // ensure it's on before using
        }
        System.out.println("Electronic duck swim...");
    }
}
