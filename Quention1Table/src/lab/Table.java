package lab;

public class Table {
    private int[][] values;
    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }
    public void set(int i, int j, int n) {
        values[i][j] = n;
    }
    public double neighbourAvarage(int row, int col){
        int numberOfNeighbours = 0;
        int sumOfNeighbours = 0;
        int tableRow = values.length;
        int tableCol = values[0].length;
        if(row-1>=0 && col-1>=0){
            sumOfNeighbours = sumOfNeighbours + values[row-1][col-1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row-1>=0 && col>=0){
            sumOfNeighbours = sumOfNeighbours + values[row-1][col];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row-1>=0 && col+1<tableCol){
            sumOfNeighbours = sumOfNeighbours + values[row-1][col+1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row>=0 && col-1>=0){
            sumOfNeighbours = sumOfNeighbours + values[row][col-1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row>=0 && col+1<tableCol){
            sumOfNeighbours = sumOfNeighbours + values[row][col+1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row+1<tableRow && col-1>=0){
            sumOfNeighbours = sumOfNeighbours + values[row+1][col-1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row+1<tableRow && col>=0){
            sumOfNeighbours = sumOfNeighbours + values[row+1][col];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        if(row+1<tableRow && col+1<tableCol){
            sumOfNeighbours = sumOfNeighbours + values[row+1][col+1];
            numberOfNeighbours = numberOfNeighbours + 1;
        }
        double avarage = (double)sumOfNeighbours/numberOfNeighbours;

        return avarage;
    }
}
