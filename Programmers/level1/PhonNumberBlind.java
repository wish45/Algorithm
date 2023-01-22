package level1;

public class PhonNumberBlind {
    /**
     * 핸드폰 번호 가리기
     * 고객들의 전화번호가 주어졌을때 뒷자리 4개를 제외한 나머지 숫자들을 모두 * 처리하는 메서드 구현
     * */
    public static void main(String args[]){
        PhonNumberBlind asd = new PhonNumberBlind();
        System.out.println(asd.solution("01033334444"));
        System.out.println(asd.solution("027778888"));
    }
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            answer+="*";
        }
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            answer+= phone_number.charAt(i);
        }
        return answer;
    }
}
