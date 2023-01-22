package level1;

public class StringControlBasic {
    public static void main(String args[]){
        StringControlBasic asd = new StringControlBasic();
        //String s = "a234";
        String s = "1234";
        System.out.println(asd.solution(s));
    }
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();

         if(ch.length!=4 && ch.length!=6){
             return false;
         }

        for(int i=0; i<ch.length; i++){
            if(!Character.isDigit(ch[i])){
                return false;
            }
        }

        return answer;
    }
}
