public class Matrix {
    public int N;
    public int M;
    public double data[][];

    // constructor
    public Matrix(int N, int M) {
        this.N = N;
        this.M = M;
        data = new double[N][M];
    }

    // transpose
    public Matrix transpose() {
        Matrix A = new Matrix(M,N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A.data[i][j] = data[j][i];
            }
        }
        return A;
    }

    // generate random matrix
    public static Matrix random(int N, int M) {
        Matrix A = new Matrix(N,M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A.data[i][j] = Math.random();
            }
        }
        return A;
    }

    // multiply two matrices
    public static Matrix multiply(Matrix A, Matrix B) {
        int N1 = A.size()[0];
        int M1 = A.size()[1];
        int N2 = A.size()[0];
        int M2 = B.size()[1];

        Matrix C = new Matrix(N1,M2);

        for (int k = 0; k < M1; k++) {
            for (int i = 0; i < N1; i++) {
                for (int j = 0; j < M2; j++) {
                    C.data[i][j] += A.data[i][k]*B.data[k][j];
                }
            }
        }
        return C;

    }

    // get matrix size
    public int[] size() {
        int[] size = {N,M};
        return size;
    }

    // print matrix
    public void print() {
        matrixPrinter prt = new matrixPrinter(N,M,data);
        prt.print();
    }
}
