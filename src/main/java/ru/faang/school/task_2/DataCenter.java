package ru.faang.school.task_2;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {
private List<Server> servers = new ArrayList<>();
    public List<Server> getServers() {
        return servers;
    }
    public double freeLoadOfAllServers(){
        double result = 0.0;
        for (Server server : servers){
            result += server.freeResources();
        }
        return result;
    }
    public double loadOfAllServers(){
        double result = 0.0;
        for (Server server : servers){
            result += server.getLoad();
        }
        return result;
    }
}
