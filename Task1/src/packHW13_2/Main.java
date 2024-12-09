package packHW13_2;


import packHW13_2.hard.HardDisk;
import packHW13_2.hard.TypeHard;
import packHW13_2.keyboard.Keyboard;
import packHW13_2.keyboard.Light;
import packHW13_2.keyboard.TypeKeyboard;
import packHW13_2.monitor.MatrixType;
import packHW13_2.monitor.Moninor;
import packHW13_2.procesor.CoreCount;
import packHW13_2.procesor.Frequency;
import packHW13_2.procesor.Procesor;
import packHW13_2.procesor.Producer;
import packHW13_2.ram.Ram;
import packHW13_2.ram.TypeRam;

public class Main {
    public static void main(String[] args) {
        Procesor procesor = new Procesor(Frequency.THREE_THOUSAND_HZ, CoreCount.FOUR_CORE, Producer.AMD, 500);
        HardDisk hardDisk = new HardDisk(TypeHard.HDD, 1000, 700);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MECHANICAL, Light.LIGHT_DEX, 400);
        Moninor moninor = new Moninor(27, MatrixType.IPS, 1500);
        Ram ram = new Ram(TypeRam.DDR4, 16, 100);

        Computer computer = new Computer("gigabyte", "игхавой", moninor, keyboard, hardDisk, ram, procesor);

        System.out.println(computer);

    }
}
