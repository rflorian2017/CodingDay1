import com.company.Computer;
import model.Memory;
import model.peripheral.Peripheral;
import model.peripheral.interfaces.WirelessPeripheral;
import model.peripheral.peripherals.Mouse;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer();
        System.out.println(computer.toString());

        System.out.println(computer.getGeneration());

        computer.setGeneration("AAA");
        System.out.println(computer);

        System.out.println(computer.getGeneration());

        Peripheral mouse1 = new Mouse("USB",
                "Microsoft");
        if(mouse1 instanceof Mouse) {
            ((Mouse) mouse1).setHasScrollWheel(true);
        }

        WirelessPeripheral mouse2 = new Mouse("USB", "Apacer");

        System.out.println(mouse1.displayDetails());
        System.out.println(((Mouse) mouse2).displayDetails());

        computer.addMemory(new Memory());
        computer.addPeripheral(mouse1);
        computer.addPeripheral((Mouse)mouse2);
        computer.addMemory(new Memory());

        //uncommenting this line will give an error
        //Peripheral myperif = new Peripheral("USB", "ACER");

    }
}
