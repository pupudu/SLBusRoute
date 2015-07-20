import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Route {

    private String routeNumber;

    private LinkedList<Location> routeIn, routeOut;

    public Route(String routeNumber) {
        this.routeNumber = routeNumber;
        routeIn = new LinkedList<>();
        routeOut = new LinkedList<>();
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void addLocationToRouteIn(Location location) {
        routeIn.add(location);
        location.addRoute(this);
    }

    public LinkedList<Location> getRouteIn() {
        return routeIn;
    }

    public void addLocationToRouteOut(Location location) {
        routeOut.add(location);
        location.addRoute(this);
    }

    public LinkedList<Location> getRouteOut() {
        return routeOut;
    }

    public Location getRouteInStartLocation() {
        return routeIn.getFirst();
    }

    public Location getRouteInEndLocation() {
        return routeIn.getLast();
    }

    public Location getRouteOutStartLocation() {
        return routeOut.getFirst();
    }

    public Location getRouteOutEndLocation() {
        return routeOut.getLast();
    }

    public boolean routeInContainsLocation(Location location) {

        for (Location loc : routeIn) {
            if (loc.getName().equals(location.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean routeOutContainsLocation(Location location) {

        for (Location loc : routeOut) {
            if (loc.getName().equals(location.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        String route = "Route In : ";

        for (int i = 0; i < routeIn.size(); i++) {
            route = route + routeIn.get(i);
            if (i != routeIn.size() - 1) {
                route = route + " -> ";
            }
        }
        
        route = route + "\nRoute Out: ";
        
        for (int i = 0; i < routeOut.size(); i++) {
            route = route + routeOut.get(i);
            if (i != routeOut.size() - 1) {
                route = route + " -> ";
            }
        }
        
        return route;
        
    }
    
    public void printData(){
        System.out.println(this.toString());
    }

}
