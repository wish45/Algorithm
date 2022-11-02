package level3;

public class WordConversion {
    public static void main(String args[]){
        WordConversion asd = new WordConversion();
        String[] word = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(asd.solution("hit","cog",word));
    }

    boolean[] visited;
    int answer = 0;

    public int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer;
    }

    public void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }

        for(int i=0; i<words.length; i++){
            if(visited[i])
                continue;

            int check = 0;
            for(int j=0; j<begin.length(); j++){
                if(begin.charAt(j) == words[i].charAt(j))
                    check++;
            }

            if(check == begin.length()-1){
                visited[i] = true;
                dfs(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }
    }
}

