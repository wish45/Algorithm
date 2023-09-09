package level1;

import java.util.Stack;
import java.util.stream.IntStream;

public class MakeHambergers {
    /**
     * 1(빵),2(야채),3(고기),1(빵) 순으로 햄버거를 만들 수 있는 갯수 리턴하기
     * stack으로 카운팅.
     * @param args
     */
    public static void main(String[] args) {
        MakeHambergers asd = new MakeHambergers();
        //int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient = 	{1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(asd.solutionV3(ingredient));
    }

    public int solutionV1(int[] ingredient) {
        Stack<Integer> stk = new Stack<>();
        int cnt = 0;

        for (int item : ingredient) {
            stk.push(item);
            if (stk.size() >= 4) {
                if (stk.get(stk.size() - 4) == 1
                        && stk.get(stk.size() - 3) == 2
                        && stk.get(stk.size() - 2) == 3
                        && stk.get(stk.size() - 1) == 1) {
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int solutionV2(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int item : ingredient) {
            stack.push(item);

            // 스택의 크기가 4 이상일 때만 확인
            if (stack.size() >= 4) {
                if (isBurger(stack)) {
                    // 햄버거 조리 가능한 경우
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }

        return count;
    }

    public int solutionV3(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int item : ingredient) {
            stack.push(item);

            // 스택의 크기가 4 이상일 때만 확인
            if (stack.size() >= 4) {
                int[] subArray = IntStream.rangeClosed(stack.size() - 4, stack.size() - 1)
                        .map(stack::get)
                        .toArray();

                if (isBurger(subArray)) {
                    // 햄버거 조리 가능한 경우
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }

        return count;
    }

    // 햄버거 조리 가능한지 확인하는 메서드
    private boolean isBurger(Stack<Integer> stack) {
        int size = stack.size();
        return stack.get(size - 4) == 1
                && stack.get(size - 3) == 2
                && stack.get(size - 2) == 3
                && stack.get(size - 1) == 1;
    }

    // 햄버거 조리 가능한지 확인하는 메서드
    private boolean isBurger(int[] subArray) {
        return subArray[0] == 1
                && subArray[1] == 2
                && subArray[2] == 3
                && subArray[3] == 1;
    }
}
