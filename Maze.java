package test55;

import java.io.IOException;

public class Maze {
    public static class Position {
        private final int x;
        private final int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };
        Position current = new Position(1, 1);
        Position goal = new Position(4, 3);

        for (; ; ) {
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.getX() && y == current.getY()) {
                        System.out.print("o");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            if (current.getX() == goal.getX() && current.getY() == goal.getY()) {
                System.out.println("GOAL!!!");
                break;
            }

            int ch = System.in.read();
            Position next;
            switch (ch) {
                case 'a':
                    next = new Position(current.getX() - 1, current.getY());
                    break;
                case 'w':
                    next = new Position(current.getX(), current.getY() - 1);
                    break;
                case 's':
                    next = new Position(current.getX() + 1, current.getY());
                    break;
                case 'z':
                    next = new Position(current.getX(), current.getY() + 1);
                    break;
                default:
                    next = current;
                    break;
            }

            if (map[next.getY()][next.getX()] == 0) {
                current = next;
            }

            System.in.read();
        }
    }
}