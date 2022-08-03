package LeetCode.medium;

public class ReverseInteger {
    public int reverse(int x) {
        int sum = 0;
        int booho = x>0 ? 1 : -1;
        x = Math.abs(x);
        int mul = (int)Math.log10(x);

        while(x>0){
            int remains = x%10; //나머지를 구하고
            x=x/10; //x에 다시 몫을 넣어주고
            sum+=(remains*Math.pow(10,mul)); // 10의 mul 제곱수
            if(sum>Integer.MAX_VALUE){
                return 0;
            }
            mul--;
        }
        return (int)sum*booho;
    }
}






