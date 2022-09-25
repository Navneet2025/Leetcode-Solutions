class Solution {
    public boolean checkStraightLine(int[][] Coordinate) {
        if(Coordinate.length==2)
            return true;
        for(int i=0;i<Coordinate.length-2;i++){
            int a = Coordinate[i+1][0];
            int b = Coordinate[i+1][1];
            int c = Coordinate[i][0];
            int d = Coordinate[i][1];
            int e = Coordinate[i+2][0];
            int f = Coordinate[i+2][1];
            
            
            if((b-d)*(e-a) !=(a-c)*(f-b))
                return false;
        }
        
        return true;
        
    }
}