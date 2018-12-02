package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Uber {
    public static void main(String[] args) {

        Machine taxi = new Taxi();
        Machine bus = new Bus();

        List<Machine> machineList = new ArrayList<>();
        machineList.add(bus);
        machineList.add(taxi);

        for (Machine machine: machineList) {
            System.out.print("Engine start: ");
            System.out.println(machine.start());
            machine.drive();
            machine.work();
            System.out.print("Engine start: ");
            System.out.println(machine.stop());
            System.out.println();
        }


    }
}
