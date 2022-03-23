public class Vector extends Matrix {
    public Vector(int dim) {
        super(dim,1);
    }

    // generate random n-dimensional vector
    public static Vector random(int dim) {
        Vector V = new Vector(dim);
        for (int i = 0; i < dim; i++) {
            V.data[i][0] = Math.random();
        }
        return V;
    }

    // multiply matrix by vector
    public static Vector transform(Matrix A, Vector V) {
      Vector W = new Vector(V.N);
      for (int k = 0; k < V.N; k++) {
        for (int i = 0; i < V.N; i++) {
          W.data[i][0] += A.data[i][k]*V.data[k][0];
        }
      }
      return W;
    }

    // standard inner product
    public static double dot(Vector A, Vector B) {
      double product = 0;
      for (int i = 0; i < A.N; i++) {
        product += A.data[i][0]*B.data[i][0];
      }
      return product;
    }
}
