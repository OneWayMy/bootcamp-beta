package ru.faang.school.task_2;

public class Server {
    private double load; // текущая загрузка 35.00%
    private double maxLoad; // максимальная загрузка 100.00%, 70.55%, 85.00;
    private double energyConsumption; // энергопотребление 70.00 ВТ

    public Server(double load, double maxLoad, double energyConsumption) {
        this.load = load;
        this.maxLoad = maxLoad;
        this.energyConsumption = energyConsumption;
    }

    public Server() {
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double freeResources() {
        return maxLoad - load;
    }
}
