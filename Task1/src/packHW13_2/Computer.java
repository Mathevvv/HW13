package packHW13_2;

import packHW13_2.hard.HardDisk;
import packHW13_2.keyboard.Keyboard;
import packHW13_2.monitor.Moninor;
import packHW13_2.procesor.Procesor;
import packHW13_2.ram.Ram;

public class Computer {

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Moninor getMonitor() {
        return monitor;
    }

    public void setMonitor(Moninor monitor) {
        this.monitor = monitor;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    private Procesor    procesor;
    private Ram              ram;
    private HardDisk    hardDisk;
    private Keyboard    keyboard;
    private Moninor monitor;

    private final String vendor;
    private final String name;


    public Computer(String vendor, String name, Moninor monitor,
                    Keyboard keyboard, HardDisk hardDisk, Ram ram,
                    Procesor procesor) {
        this.vendor = vendor;
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.procesor = procesor;
    }

    double weightCounter(){
        return keyboard.getWeight()+
                hardDisk.getWeight()+
                monitor.getWeight()+
                ram.getWeight()+
                procesor.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor=" + procesor +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                ", keyboard=" + keyboard +
                ", monitor=" + monitor +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
