import java.text.DecimalFormat;

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
