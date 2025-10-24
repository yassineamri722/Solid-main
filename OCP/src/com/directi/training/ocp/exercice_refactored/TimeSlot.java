package com.directi.training.ocp.exercise;

public class TimeSlot extends Resource
{
    @Override
    public int allocate()
    {
        resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot()
    {
        System.out.println("Finding free time slot...");
        return 1;
    }

    private void markTimeSlotBusy(int resourceId)
    {
        System.out.println("Time slot " + resourceId + " marked busy");
    }

    private void markTimeSlotFree(int resourceId)
    {
        System.out.println("Time slot " + resourceId + " freed");
    }
}
