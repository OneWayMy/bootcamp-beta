package ru.faang.school.task_2;

import java.util.Optional;

public class DataCenterService {
    OptimizationStrategy optimizationStrategy;
    private DataCenter dataCenter;

    public DataCenterService(OptimizationStrategy optimizationStrategy, DataCenter dataCenter) {
        this.optimizationStrategy = optimizationStrategy;
        this.dataCenter = dataCenter;
    }


    public void addServer(Server server) {
        dataCenter.getServers().add(server);
    }

    public void removeServer(Server server) {
        dataCenter.getServers().remove(server);
    }

//        public Optional<Double> getTotalEnergyConsumption(){
//        return dataCenter.getServers().stream().map(Server::getEnergyConsumption).reduce(Double::sum);
//   }

    public double getTotalEnergyConsumption() {
        double sum = 0.0;
        if (!dataCenter.getServers().isEmpty()) {
            for (Server server : dataCenter.getServers()) {
                sum += server.getEnergyConsumption();
            }
            return sum;
        }
        return sum;
    }

    public void allocateResources(ResourceRequest request) {
        double currentRequest = request.getLoad();
        if (dataCenter.freeLoadOfAllServers() > currentRequest) {
            double oneServerLoad = currentRequest / dataCenter.getServers().size();      // Заполняем существующие сервера и распределяем нагрузку равномерно.
            for (Server server : dataCenter.getServers()) {
                server.setLoad(server.getLoad() + oneServerLoad);
            }
        }else {

            // Потрубить необходимое количество серверов, загрузить на максимум кроме последнего          // < 700 + 300 = 1000
            // Найти остаточную нагрузку при максимально заполнености текущих серверов
            // выделить дополнительный сервер и проверить хватает ли загрузки, засетить загруженость.

            while (dataCenter.maxLoadOfAllServers() <= currentRequest + dataCenter.loadOfAllServers())  {
                dataCenter.getServers().add(new Server(0.0, 0));

            }
        }
    }
}

//  double requestLoad = request.getLoad();
//       if (dataCenter.freeLoadOfAllServers() > requestLoad){
//           for (Server server : dataCenter.getServers()){
//              double serverFreeResources = server.freeResources(); //65%
//              //
//           }
//       }


//------------------------------------------------------
// double currentRequest = request.getLoad();
//        for (Server server : dataCenter.getServers()) {
//            server.setLoad(server.getMaxLoad());
//            currentRequest -= server.freeResources();
//        }
//        dataCenter.getServers().add();
//    }