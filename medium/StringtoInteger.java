package medium;

class StringtoInteger {
    public int myAtoi(String s) {
        //공백제거
        //변환가능한 문자열 추출
        s = s.trim();
        int length = s.length();
        if(length<=0){
            return 0;
        }
        char ch;
        String str2="";
        boolean skip = true;

        for(int i=0; i<length; i++){
            ch = s.charAt(i);
            if((ch!='-'&& ch!='+' && !(ch>='0' && ch<='9')) && i==0){
                return 0;
            }
            if((ch=='-' || ch=='+' || !(ch>='0' && ch<='9')) && i>=1){
                break;
            }
            if(skip==true && ch=='0'){
                continue;
            }else if(ch!='-' && ch!='+'){
                skip = false;
            }

            str2+=ch;
        }
        length=str2.length();
        if(length<=0){
            return 0;
        }
        ch = str2.charAt(0);
        int booho = 1;
        long ret = 0; //결과변수 overflow
        int index = 0;

        if(ch=='-' || ch=='+'){
            index = 1;
            if(ch=='-'){
                booho = -1;
            }
        }
        if((length-index)>10){
            if(booho==1){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        for(int i=index;i<length;i++){
            char c = str2.charAt(i);
            ret+= ((c-'0')*Math.pow(10,length-i-1));

            if((ret*booho)>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if((ret*booho)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)ret*(booho);


    }
}





