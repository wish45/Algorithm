package level2;

public class Tile2ByN {
    /**
     * 2 x n 타일링
     * */

    public static void main(String args[]){
        Tile2ByN asd= new Tile2ByN();
        System.out.println(asd.solution(3));
    }
    public int solution(int n) {
        int[] ret = new int[n+1];
        ret[1] = 1;
        ret[2] = 2;

        for(int i=1; i<n-1; i++){
            ret[i+2] = (ret[i+1] + ret[i]) %1000000007;
        }
        return ret[n];
    }
}
