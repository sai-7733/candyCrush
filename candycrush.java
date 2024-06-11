import java.util.*;
class A{
    private int target;
    private int rows;
    private int cols;
    private char[][] map;
    pulic A(int target,int rows,int cols,char[][] map){
        this.target=target;
        this.rows=rows;
        this.cols=cols;
        this.map=new char[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                this.map[i][j]=map[i][j];
            }
        }
        public void swapCandy(int row1,int col1,int row2,int col2){
            char temp=map[rows][cols];
            map[row1][col1]=map[row2][col2];
            map[row2][col2]=temp;
        }
        public void scanMap(){
            Boolean exit=true;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(map[i][j]!='0' && map[i][j]!='-' &&(horiCheck(i,j) || vertiCheck(i,j))){
                        markCandy(i,j);
                        exit=false;
                    }
                }
            }
            removeCrushCandy();
            if(exist)
            return;
            else
            scanMap;
        }
        public void markCandy(int row,int col){
            if(horiCheck(row,col)){
                if(col>=1 && map[row][col]==map[row][col])
                markLeft(row,col-1);
                if(col<=cols-2 && map[row][col+1]==map[row][col])
                markRight(row,col+1);
            }
            if(vertiCheck(row,col)){
                if(row>=1 && map[row-1][col]==map[row][col])
                markTop(row,col);
                if(row<=rows-2 && map[row+1][col]==map[row][col])
                markButton(row,col);
            }
            map[row][col]='0';
        }
        public boolean horiCheck(int row,int col){
            if(col>=2 && map[row][col-1]==map[row][col] && map[row][col-2]==map[row][col])
            return true;
            else if(col<=cols-3 && map[row][col+1]==map[row][col] && map[row][col+2]==map[row][col] )
            return true;
        }
        public boolean vertiCheck(int roe,int col){
            if(row>=2 && map[row-1][col]==map[row][col] && map[row-2][col]==map[row][col])
            return true;
        else if(row<=rows-3 && map[row+1][col]==map[row][col] && map[row+2][col]==map[row][col] )
            return true;
        }
    }
}