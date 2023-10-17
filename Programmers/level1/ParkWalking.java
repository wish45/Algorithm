package level1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParkWalking {
    public static void main(String[] args) {
        ParkWalking asd = new ParkWalking();
        //String[] park = new String[]{"SOO", "OOO", "OOO"};
        //String[] routes = new String[]{"E 2", "S 2", "W 1"};         //2,1

        //String[] park = new String[]{"SOO","OXX","OOO"};
        //String[] routes = new String[]{"E 2","S 2","W 1"};         //0,1

        String[] park = new String[]{"OSO", "OOO", "OXO", "OOO"};
        String[] routes = new String[]{"E 2", "S 3", "W 1"};         //0,1

        System.out.println(asd.solution(park, routes));

    }

  /* public static int[] solution(String[] park, String[] routes) {
       int[] currentPosition = findStartPoint(park);

       for (String route : routes) {
           String[] command = route.split(" ");
           String direction = command[0];
           int distance = Integer.parseInt(command[1]);

           currentPosition = move(currentPosition, direction, distance, park);

           if (currentPosition == null) {
               break; // 중간에 이동 불가한 경우 루프 종료
           }
       }

       return currentPosition;
   }

    public static int[] findStartPoint(String[] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return null; // 시작 지점을 찾을 수 없는 경우
    }

    public static int[] move(int[] currentPosition, String direction, int distance, String[] park) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 북, 남, 서, 동

        for (int i = 0; i < distance; i++) {
            int newRow = currentPosition[0] + directions[getDirectionIndex(direction)][0];
            int newCol = currentPosition[1] + directions[getDirectionIndex(direction)][1];

            if (!isValidMove(newRow, newCol, park)) {
                break; // 중간에 이동 불가한 경우 루프 종료
            }

            currentPosition[0] = newRow;
            currentPosition[1] = newCol;
        }

        return currentPosition;
    }

    public static int getDirectionIndex(String direction) {
        String[] directions = {"N", "S", "W", "E"};
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                return i;
            }
        }
        return -1; // 유효하지 않은 방향
    }

    public static boolean isValidMove(int row, int col, String[] park) {
        int numRows = park.length;
        int numCols = park[0].length();

        return row >= 0 && row < numRows && col >= 0 && col < numCols && park[row].charAt(col) != 'X';
    }*/
  public int[] solution(String[] park, String[] routes) {
      int startX = 0;
      int startY = 0;

      char[][] grid = new char[park.length][park[0].length()];

      for (int i = 0; i < park.length; i++) {
          grid[i] = park[i].toCharArray();
          if (park[i].contains("S")) {
              startY = i;
              startX = park[i].indexOf("S");
          }
      }

      for (String route : routes) {
          String[] parts = route.split(" ");
          String direction = parts[0];
          int steps = Integer.parseInt(parts[1]);

          int newX = startX;
          int newY = startY;

          for (int i = 0; i < steps; i++) {
              switch (direction) {
                  case "E":
                      newX++;
                      break;
                  case "W":
                      newX--;
                      break;
                  case "S":
                      newY++;
                      break;
                  case "N":
                      newY--;
                      break;
              }

              if (newX >= 0 && newY >= 0 && newY < grid.length && newX < grid[0].length) {
                  if (grid[newY][newX] == 'X') {
                      break;
                  }
                  if (i == steps - 1) {
                      startX = newX;
                      startY = newY;
                  }
              }
          }
      }

      return new int[]{startY, startX};
    }
}