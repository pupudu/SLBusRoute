import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Location {

    private String name;
    private LinkedList<Route> routes;

    public Location(String name) {
        routes = new LinkedList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoute(Route route) {
        if (!routes.contains(route)) {
            routes.add(route);
        }
    }

    public LinkedList<Route> getRoutes() {
        return routes;
    }

    public void printData() {

        
        System.out.println("Location: " + name);
        for (Route route : routes) {
            System.out.println(route.getRouteNumber());
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return name;
    }

}
