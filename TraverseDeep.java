package test55;

public class TraverseDeep {
    static int[][] map = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 2, 1},
            {1, 1, 1, 1, 1, 1, 1},
    };

    public static void main(String[] args) {
        traverse(1, 1);
        char[] ch = {'.', '*', 'G', 'o'};
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }

    static boolean traverse(int curX, int curY) {
        if (map[curY][curX] == 0) {
            map[curY][curX] = 3;
            if (traverse(curX + 1, curY) ||
                traverse(curX - 1, curY) ||
                traverse(curX, curY + 1) ||
                traverse(curX, curY - 1)) {
                return true;
            }
            map[curY][curX] = 0;
        } else if (map[curY][curX] == 2) {
            return true;
        }
        return false;
    }
}