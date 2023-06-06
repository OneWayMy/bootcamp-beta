package ru.faang.school.task_2;

import java.util.Optional;

public class DataCenterService {
    private DataCenter dataCenter;

    public DataCenterService(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }

    public void addServer(Server server) {
        dataCenter.getServers().add(server);
    }

    public void removeServer(Server server) {
        dataCenter.getServers().remove(server);
    }

        public Optional<Double> getTotalEnergyConsumption(){
        return dataCenter.getServers().stream().map(Server::getEnergyConsumption).reduce(Double::sum);
   }

//    public double getTotalEnergyConsumption() {
//        double sum = 0.0;
//        if (!dataCenter.getServers().isEmpty()) {
//            for (Server server : dataCenter.getServers()) {
//                sum += server.getEnergyConsumption();
//            }
//            return sum;
//        }
//        return sum;
//    }
    public void allocateResources(ResourceRequest request){
        double rest = request.getLoad() - dataCenter.freeLoadOfAllServers(); // 700.00 - 450.00
        }
    }
}
