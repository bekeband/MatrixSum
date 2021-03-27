public class Matrix {

    Integer value;

    public Matrix() {
        this.value = 0;
    }

    public Matrix(Integer value) {
        this.value = value;
    }

    public Matrix sum(Matrix m1, Matrix m2) {
        return new Matrix(m1.getValue() + m2.getValue());
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
