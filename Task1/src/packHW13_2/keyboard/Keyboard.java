package packHW13_2.keyboard;

public class Keyboard {
    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(TypeKeyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private TypeKeyboard  typeKeyboard;
    private Light  light;
    private double weight;

    public Keyboard(TypeKeyboard typeKeyboard, Light light, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.light = light;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "typeKeyboard=" + typeKeyboard +
                ", light=" + light +
                ", weight=" + weight +
                '}';
    }
}
