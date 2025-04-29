package matrizenrechner;

public class Matrix {
    private int[][] myMatrix;

    
    public Matrix(int[][] array) {
        this.myMatrix = array;
    }

    
    public Matrix matrixAddieren(Matrix andereMatrix) {
        int[][] matrixA = this.myMatrix;
        int[][] matrixB = andereMatrix.getMyMatrix();

        int rows = matrixA.length;
        int cols = matrixA[0].length;

       
        if (matrixB.length != rows || matrixB[0].length != cols) {
            throw new IllegalArgumentException("Matrizen haben unterschiedliche Größen!");
        }

        int[][] result = new int[rows][cols];

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return new Matrix(result);
    }

 
    public void ausgeben() {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public int[][] getMyMatrix() {
        return myMatrix;
    }

    
    public void setMyMatrix(int[][] myMatrix) {
        this.myMatrix = myMatrix;
    }
}

