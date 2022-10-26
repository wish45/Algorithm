package level2;

public class RepeatBinaryTransformation {
    public static void main(String args[]){
        RepeatBinaryTransformation asd = new RepeatBinaryTransformation();
        System.out.println(asd.solution("110010101001"));
        //System.out.println(asd.solution("1111111"));
    }
    public int[] solution(String s) {
 /*       int[] answer = {0,0};
        int cnt = 0;
        int zerocnt = 0;
        int len = s.length();
        String str = s;
        int oricnt = 0;
        String binaryString = "";

        while(len!=1){
            oricnt = str.length();
            str = str.replaceAll("0","");
            zerocnt += oricnt - str.length();
            binaryString = Integer.toBinaryString(str.length());
            str = binaryString;
            len = Integer.parseInt(str);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zerocnt;
        return answer;
        */

        int[] answer = new int[2];

        while(s.length() > 1) {

            int cntOne = 0;
            for(int i=0; i<s.length(); i++) {

                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }

        return answer;
    }
}

