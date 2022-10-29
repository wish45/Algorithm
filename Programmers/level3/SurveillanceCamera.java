package level3;

import java.util.Arrays;

public class SurveillanceCamera {
    /**
     * 감시카메라를 최소 몇개를 세워야 할지에 대한 값을 return 하는 문제
     *
     * routes[i][0] 는 고속도로에 자동차가 진입한 시점
     * routes[i][1] 는 고속도로에서 자동차가 나간 시점
     *
     * routes                                       return
     * [[-20,-15], [-14,-5], [-18,-13], [-5,-3]]	2
     *
     * ex) -20이 진입, -15가 출차
     * */
    public static void main(String args[]){
        SurveillanceCamera asd = new SurveillanceCamera();
        //int[][] routes = new int[][]{{-20,-15},{-14,-5},{-18,-13},{-5,-3}};
        int[][] routes = new int[][]{{15,20},{5,14},{13,18},{3,5}};
        System.out.println(asd.solution(routes));
    }
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, (o1, o2) -> {
            return o1[1]-o2[1]; // 첫번째 숫자 기준 오름차순 {{-20,-15},{-18,-13},{-14,-5},{-5,-3}}
        });

        int poll = routes[0][1];
        
        for(int i=0; i<routes.length; i++){
            if(routes[i][0] > poll){
                answer++;
                poll = routes[i][1];
            }
        }


        return answer;
    }
}
