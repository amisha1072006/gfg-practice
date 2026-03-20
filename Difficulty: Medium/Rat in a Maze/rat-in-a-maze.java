class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
         PathFinder finder = new PathFinder(new GridGraph(maze));
        return finder.getAllPaths();
    }
}

class PathFinder{
    GridGraph graph;
    ArrayList<String> allPaths;
    PathFinder(GridGraph graph){
        this.graph = graph;
    }
    ArrayList<String> getAllPaths(){
        allPaths=new ArrayList<>();
        Cell firstCell = graph.startCell();
        if(graph.isClosed(firstCell) || graph.isClosed(graph.lastCell())){
            return allPaths;
        }
        graph.setClosed(firstCell);
        buildPath(firstCell,new StringBuffer());
        return allPaths;
    }
    void buildPath(Cell currCell,StringBuffer currentPath){
        if(graph.isFinalCell(currCell)){
            allPaths.add(currentPath.toString());
            return;
        }
        for(int dir=0;dir<4;dir++){
            Cell nextCell=currCell.getNextCell(dir);
            if(graph.shouldGo(nextCell)){
                currentPath.append(Cell.dirChar[dir]);
                graph.setClosed(nextCell);
                buildPath(nextCell,currentPath);
                graph.setOpen(nextCell);
                currentPath.deleteCharAt(currentPath.length()-1);
            }
        }
    }
}
class GridGraph{
    
    int grid[][];
    int OPEN = 1,CLOSED = 0;
    GridGraph(int grid[][]){
        this.grid = grid;
    }
    boolean isFinalCell(Cell cell){
        return cell.row==grid.length-1 && cell.col==grid[0].length-1;
    }
    boolean shouldGo(Cell cell){
        return isInBound(cell) && !isClosed(cell);
    }
    boolean isInBound(Cell cell){
        return cell.row>=0 && cell.row<grid.length && cell.col>=0 && cell.col<grid[0].length;
    }
    void setClosed(Cell cell){
        grid[cell.row][cell.col]=CLOSED;
    }
    void setOpen(Cell cell){
        grid[cell.row][cell.col] = OPEN;
    }
    boolean isClosed(Cell cell){
        return grid[cell.row][cell.col] == CLOSED;
    }
    Cell startCell(){
        return new Cell(0,0);
    }
    Cell lastCell(){
        return new Cell(grid.length-1, grid[0].length-1);
    }
    
}
class Cell{
    int row,col;
    Cell(int row,int col){
        this.row=row;
        this.col=col;
    }
    int dir[][]=new int[][]{{1,0},{0,-1},{0,1},{-1,0}};
    static char dirChar[]=new char[]{'D','L','R','U'};
    Cell getNextCell( int index){
        return new Cell(
                    this.row + dir[index][0],
                    this.col + dir[index][1]
                );

    }
}