package com.directi.training.ocp.exercise;

public abstract class Resource
{
    protected int resourceId;

    public abstract int allocate();
    public abstract void free(int resourceId);
}
