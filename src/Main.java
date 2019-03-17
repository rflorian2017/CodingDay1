import com.company.Computer;
import model.peripheral.Peripheral;
import model.peripheral.peripherals.Keyboard;
import model.peripheral.peripherals.Mouse;
import model.peripheral.peripherals.mice.WirelessMouse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer();

        System.out.println(computer.getGeneration());

        computer.setGeneration("AAA");

        System.out.println(computer.getGeneration());

        Peripheral mouse1 = new WirelessMouse("USB",
                "Microsoft");
        if(mouse1 instanceof Mouse) {
            ((Mouse) mouse1).setHasScrollWheel(true);
        }

        System.out.println(mouse1.displayDetails());

    }
}
