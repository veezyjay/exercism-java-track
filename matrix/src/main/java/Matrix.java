import java.util.Arrays;

class Matrix {
    private String[] matrix;

    Matrix(String matrixAsString) {
        this.matrix = matrixAsString.split("\n");
    }

    int[] getRow(int rowNumber) {
        String rowStrings = matrix[rowNumber - 1];
        int[] row = Arrays.stream(rowStrings.split(" ")).mapToInt(Integer::parseInt).toArray();
        return row;
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            String[] currentStrings = matrix[i].split(" ");
            column[i] = Integer.parseInt(currentStrings[columnNumber - 1]);
        }
        return column;
    }
}
