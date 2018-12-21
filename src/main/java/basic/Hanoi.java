package basic;

public class Hanoi {

    public void move(int disks, String source, String aux, String dest) {
        if (disks == 1) {
            System.out.printf("Move disk %d from %s to %s\n", 1, source, dest);
            return;
        } else {
            move(disks - 1, source, dest, aux);
            System.out.printf("Move disk %d from %s to %s\n", disks, source, dest);
            move(disks - 1, aux, source, dest);
        }
    }

    public static void main(String[] args) {
        new Hanoi().move(3, "A", "B", "C");
    }
}
