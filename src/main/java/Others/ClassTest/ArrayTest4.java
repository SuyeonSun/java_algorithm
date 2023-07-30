package Others.ClassTest;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0;

        int[][] arr = new int[5][5];

        int x = 0;
        int y = 0;

        for (int i = 1; i <= 5*5; i++) {
            arr[x][y] = i;
            if (x + dx[dir] >= 5 || y + dy[dir] >= 5 ||
                    x + dx[dir] < 0 || y + dy[dir] < 0 ||
                    arr[x + dx[dir]][y + dy[dir]] != 0 // 숫자가 이미 입력되었지 확인
            ) {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}