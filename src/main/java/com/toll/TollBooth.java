package com.toll;
import java.util.List;
import java.util.ArrayList;
class TollBooth {
    private int id;
    private List<Vehicle> cars = new ArrayList<>();
    private List<Vehicle> trucks = new ArrayList<>();
    private List<Vehicle> scooters= new ArrayList<>();
    private List<Vehicle> buses= new ArrayList<>();

    TollBooth(int id)
    {
        this.id=id;
    }
    void add(String str)
    {
        Vehicle v = null;
        if(str.contains("c")) {
            v = new Car();	//used dynamic method dispatch
            cars.add(v);
        }
        else if(str.contains("t")) {
            v =new Truck();
            trucks.add(v);
        }
        else if(str.contains("s")) {
            v =new Scooter();
            scooters.add(v);
        }
        else if(str.contains("b")) {
            v =new Bus();
            buses.add(v);
        }
    }
    public void printToll(){ //printing toll
        int car_count=cars.size();
        int truck_count=trucks.size();
        int scooter_count=scooters.size();
        int bus_count=buses.size();
        System.out.println("Toll id: "+id);
        if(car_count>0)
            System.out.println("No of cars= "+car_count+
                    "\tToll of car= "+car_count*cars.get(0).cost);
        if(truck_count>0)
            System.out.println("No of truck= "+truck_count+
                    "\tToll of truck= "+truck_count*trucks.get(0).cost);
        if(scooter_count>0)
            System.out.println("No of scooters/bikes= "+scooter_count+
                    "\tToll of scooter/bikes= 0");
        if(bus_count>0)
            System.out.println("No of buses= "+bus_count+
                    "\tToll of bus= "+bus_count*buses.get(0).cost);
    }
}
