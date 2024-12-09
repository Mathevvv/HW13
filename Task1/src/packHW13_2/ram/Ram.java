package packHW13_2.ram;

public class Ram {
    public TypeRam getTypeRam() {
        return typeRam;
    }

    public void setTypeRam(TypeRam typeRam) {
        this.typeRam = typeRam;
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

    private TypeRam typeRam;
    private double volume;
    private double weight;

    public Ram(TypeRam typeRam, double volume, double weight) {
        this.typeRam = typeRam;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "typeRam=" + typeRam +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
