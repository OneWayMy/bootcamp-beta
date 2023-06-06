package ru.faang.school.task_2;

public class ResourceRequest {
    private double load; // 700.00%  maxload 7- servers

    public ResourceRequest(double load) {
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
