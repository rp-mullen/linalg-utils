import java.text.DecimalFormat;

public class MyClass {
    public static void main(String[] args) {
        Matrix A = Matrix.random(3,3);
        A.print();
    }
}

class Matrix {
    private final int N;
    private final int M;
    private double data[][];
    
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
    
    public static Matrix random(int N, int M) {
        Matrix A = new Matrix(N,M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A.data[i][j] = Math.random();
            }
        }
        return A;
    }
    
    public int[] size() {
        int[] size = {N,M};
        return size;
    }
    
    public double[][] data() {
        return data;
    }
    
    public void print() {
        matrixPrinter prt = new matrixPrinter(N,M,data);
        prt.print();
    }
}

class matrixPrinter {
    private int N;
    private int M;
    private double[][] data;
    
    public matrixPrinter(int N, int M, double[][] data) {
        this.N = N;
        this.M = M;
        this.data = data;
    }
    
    public void print() {
        DecimalFormat df = new DecimalFormat("#.###");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(df.format(data[i][j]) + " ");
            }
            System.out.print("\n");
        }    
    }    
}
