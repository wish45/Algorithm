package Easy;

class RomantoInteger {
    public int romanToInt(String s) {
        char before = 0;
        char cur = 0;
        int length = s.length();
        int sum = 0;

        for(int i=0; i<length;i++){
            cur = s.charAt(i);
            if(before=='I' && cur=='V'){
                sum+=3;
            }else if(before=='I' && cur=='X'){
                sum+=8;
            }else if(before=='X' && cur=='L'){
                sum+=30;
            }else if(before=='X' && cur=='C'){
                sum+=80;
            }else if(before=='C' && cur=='D'){
                sum+=300;
            }else if(before=='C' && cur=='M'){
                sum+=800;
            }else if(cur=='I'){
                sum+=1;
            }else if(cur=='V'){
                sum+=5;
            }else if(cur=='X'){
                sum+=10;
            }else if(cur=='L'){
                sum+=50;
            }else if(cur=='C'){
                sum+=100;
            }else if(cur=='D'){
                sum+=500;
            }else if(cur=='M'){
                sum+=1000;
            }
            before = cur;
        }
        return sum;
    }
}
