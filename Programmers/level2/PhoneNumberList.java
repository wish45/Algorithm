package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
    /**
     *전화번호 리스트 중에 한 번호가 다른 나머지 번호의 접두어 인지 판단하는 알고리즘
     * 접두어면 false, 접두어가 아니면 true를 리턴
     *    for문으로 통한 방식과, hash를 통한 방식
     * */
    public static void main(String args[]){
        PhoneNumberList asd = new PhoneNumberList();
        String[] str = new String[]{"119", "97674223", "1195524421"};
        //String[] str = new String[]{"123","456","789"};
        System.out.println(asd.solution(str));
    }
    public boolean solution(String[] phone_book) {
    /*    Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;*/

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }
        return true;
    }
}
