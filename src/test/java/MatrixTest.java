import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    Matrix matrix;

    @BeforeEach
    void init() {
        matrix = new Matrix();
    }

    @org.junit.jupiter.api.Test
    void sum() {
        Matrix m1 = new Matrix(100);
        Matrix m2 = new Matrix(32);
        assertTrue(matrix.sum(m1, m2).getValue() == 132);
    }
}