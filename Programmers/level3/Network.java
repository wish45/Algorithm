package level3;

public class Network {
    /**
     * 각각의 네트워크가 연결되어있는지 확인하는 문제,
     * 네트워크의 갯수 구하는 문제
     * */
    public static void main(String args[]){
        Network asd = new Network();
        int[][] num = new int[][]{{1, 1, 0},{1, 1, 0},{0, 0, 1}};
        System.out.println(asd.solution(3,num));
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

        for (int i = 0; i < computers.length; i++) {
            if (visited[i]==false) {
                dfs(i,visited, computers);
                answer++;
            }
        }

        return answer;
    }
    /*
    1,1,0
    1,1,0
    0,0,1
*/
    public void dfs(int node, boolean[] visited, int[][] computers) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if(visited[i] == false && computers[node][i]==1){
                dfs(i, visited,computers);
            }
        }
        //return visited;
    }
}
