import com.company.Computer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer();

        System.out.println(computer.getGeneration());

        computer.setGeneration("AAA");

        System.out.println(computer.getGeneration());

    }
}
