package level2;

public class Tile3ByN {
    public static void main(String args[]){
        Tile3ByN asd = new Tile3ByN();
        System.out.println(asd.solution(4));
    }
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        arr[1] = 2;
        arr[2] = 3;

        for(int i=3; i<=n; i++){
            if(i%2!=0){
                arr[i] = (arr[i-1]*2)%1000000007 + (arr[i-2])%1000000007;
            }else{
                arr[i] = (arr[i-1])%1000000007 + (arr[i-2]%1000000007);
            }
            arr[i] = arr[i]%1000000007;
        }
        answer = arr[n];
        return answer;
    }
}
