package packHW13_2.hard;

public class HardDisk {
    public TypeHard getTypeHard() {
        return typeHard;
    }

    public void setTypeHard(TypeHard typeHard) {
        this.typeHard = typeHard;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private TypeHard typeHard;
    private double volume;
    private double weight;

    public HardDisk(TypeHard typeHard, double volume, double weight) {
        this.typeHard = typeHard;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "typeHard=" + typeHard +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
