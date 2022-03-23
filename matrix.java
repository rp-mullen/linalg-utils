import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        
        Matrix A = Matrix.random(4,2);
        Matrix B = Matrix.random(2,3);
        
        System.out.println("|  4 x 2  Matrix  |");
        A.print();
        
        System.out.println("");
        
        System.out.println("|  2 x 3  Matrix  |");
        B.print();
        
        System.out.println("");
        
        System.out.println("|  4 x 3  Matrix  |");
        Matrix C = Matrix.multiply(A,B);
        C.print();
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
    
    // get matrix data
    public double[][] data() {
        return data;
    }
    
    // print matrix
    public void print() {
        matrixPrinter prt = new matrixPrinter(N,M,data);
        prt.print();
    }
}


// printer class
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
