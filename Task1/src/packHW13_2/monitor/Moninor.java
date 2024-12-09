package packHW13_2.monitor;

public class Moninor {
    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(MatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double diagonal;
    private MatrixType matrixType;
    private double weight;

    public Moninor(double diagonal, MatrixType matrixType, double weight) {
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Moninor{" +
                "diagonal=" + diagonal +
                ", matrixType=" + matrixType +
                ", weight=" + weight +
                '}';
    }
}
