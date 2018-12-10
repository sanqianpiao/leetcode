package dailycodingproblem;

public class ClockwiseSpiral {

    public void print(int[][] a) {
        if (a == null || a[0] == null) return;
        //right, down, left, up
        int[] boundary = {a[0].length - 1, a.length - 1, 0, 1};

        int dir = 0, step = a.length * a[0].length;
        int row = 0, col = -1;

        while (step > 0) {
            if (dir == 0) {
                while (col < boundary[dir]) {
                    System.out.println(a[row][++col]);
                    step--;
                }
                boundary[dir]--;
                dir = (dir + 1) % 4;
            }
            if (dir == 1) {
                while (row < boundary[dir]) {
                    System.out.println(a[++row][col]);
                    step--;
                }
                boundary[dir]--;
                dir = (dir + 1) % 4;
            }
            if (dir == 2) {
                while (col > boundary[dir]) {
                    System.out.println(a[row][--col]);
                    step--;
                }
                boundary[dir]++;
                dir = (dir + 1) % 4;
            }
            if (dir == 3) {
                while (row > boundary[dir]) {
                    System.out.println(a[--row][col]);
                    step--;
                }
                boundary[dir]++;
                dir = (dir + 1) % 4;
            }
        }

    }
}
