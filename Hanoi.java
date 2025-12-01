public class Hanoi {
    private int numDisks;
    private int startPillar;
    private int targetPillar;
    private int timeStep;

    private int[][] pillars;
    private int[] tracker;

    public Hanoi(int numDisks, int startPillar, int targetPillar) {
        this.numDisks = numDisks;
        this.startPillar = startPillar - 1;
        this.targetPillar = targetPillar - 1;
        this.timeStep = 0;

        pillars = new int[3][numDisks];
        tracker = new int[3];

        
        for (int i = 0; i < numDisks; i++) {
            pillars[this.startPillar][i] = numDisks - i;
        }
        tracker[this.startPillar] = numDisks;

        System.out.println("My Solution is:");
        printState();

        int aux = findAuxPillar(this.startPillar, this.targetPillar);
        solve(numDisks, this.startPillar, this.targetPillar, aux);
    }

    private int findAuxPillar(int start, int target) {
        for (int i = 0; i < 3; i++) {
            if (i != start && i != target)
                return i;
        }
        return -1; 
    }

    private void solve(int n, int from, int to, int aux) {
        if (n == 0) return;

        solve(n - 1, from, aux, to);
        moveDisk(from, to);
        solve(n - 1, aux, to, from);
    }

    private void moveDisk(int from, int to) {
        if (tracker[from] == 0) return;

        int disk = pillars[from][tracker[from] - 1];
        pillars[from][--tracker[from]] = 0;
        pillars[to][tracker[to]++] = disk;

        timeStep++;
        printState();
    }

    private void printState() {
        System.out.println("t" + timeStep + " Pillar1: " + pillarString(0));
        System.out.println("t" + timeStep + " Pillar2: " + pillarString(1));
        System.out.println("t" + timeStep + " Pillar3: " + pillarString(2));
    }

    private String pillarString(int pillarIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tracker[pillarIndex]; i++) {
            sb.append(pillars[pillarIndex][i]).append(" ");
        }
        return sb.toString().trim();
    }
}
