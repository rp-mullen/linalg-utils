public class Main {
    public static void main(String[] args) {
        System.out.println("|  MULTIPLICATION TEST  |");
        System.out.println("---------------------------------------------------");

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

        System.out.println("");
        System.out.println("|  TRANSPOSE TEST  |");
        System.out.println("---------------------------------------------------");

        Matrix X = Matrix.random(3,5);
        X.print();

        System.out.println("");


        Matrix X_T = X.transpose();
        X_T.print();

        System.out.println("");
        System.out.println("|  VECTOR TEST  |");
        System.out.println("---------------------------------------------------");

        System.out.println("|  INPUT VECTOR  |");
        Vector V = Vector.random(3);
        V.print();

        System.out.println("");
        System.out.println("|  TRANSFORMATION MATRIX  |");
        Matrix T = Matrix.random(3,3);
        T.print();

        System.out.println("");
        System.out.println("|  OUTPUT VECTOR  |");
        Vector W = Vector.transform(T,V);
        W.print();

        System.out.println("");

        System.out.println("|  INNER PRODUCT TEST  |");
        System.out.println("---------------------------------------------------");

        System.out.println("|  VECTOR 1 |");
        Vector Y = Vector.random(4);
        Y.print();

        System.out.println("");

        System.out.println("|  VECTOR 2 |");
        Vector Z = Vector.random(4);
        Z.print();

        System.out.println("");
        System.out.println("PRODUCT: " + Vector.dot(Y,Z));

    }

}
