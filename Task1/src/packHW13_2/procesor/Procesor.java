package packHW13_2.procesor;

public class Procesor {
    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private Frequency frequency;
    private CoreCount coreCount;
    private Producer producer;
    private double weight;

    public Procesor(Frequency frequency, CoreCount coreCount, Producer producer, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.producer = producer;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", producer=" + producer +
                ", weight=" + weight +
                '}';
    }
}
