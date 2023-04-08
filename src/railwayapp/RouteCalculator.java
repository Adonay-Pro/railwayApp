package railwayapp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class RouteCalculator {
    private List<String> permutations;
    private List<RailwayStations> railwayStations;

    public RouteCalculator(List<String> permutations, List<RailwayStations> railwayStations) {
        this.permutations = permutations;
        this.railwayStations = railwayStations;
    }
    public List<Routes> calculateAllRoutes() {

        List<Routes> routes = new ArrayList<>();
        for (int i = 0; i < permutations.size(); i++) {
            String perm = permutations.get(i);
            double overallDistance = 0;
            for (int j = 0; j < perm.length() - 1; j++) {
                String str1 = perm.charAt(j) + "";
                String str2 = perm.charAt(j + 1) + "";
                RailwayStations r1 = railwayStations.stream().filter(a -> a.getLabel().equals(str1)).findAny().get();
                RailwayStations r2 = railwayStations.stream().filter(a -> a.getLabel().equals(str2)).findAny().get();
                int deltaX = Math.abs(r1.getX() - r2.getX());
                int deltaY = Math.abs(r1.getY() - r2.getY());
                double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
                overallDistance = distance + overallDistance;
            }
            Routes route = new Routes(perm, overallDistance);

            routes.add(route);
        }
        return routes;
    }

    public List<String> getPermutations() {
        return permutations;
    }

    public void setPermutations(List<String> permutations) {
        this.permutations = permutations;
    }

    public List<RailwayStations> getRailwayStations() {
        return railwayStations;
    }

    public void setRailwayStations(List<RailwayStations> railwayStations) {
        this.railwayStations = railwayStations;
    }
}
