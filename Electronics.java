public class Electronics {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int total = keyboard + drive;
                if (total <= b) {
                    maxSpent = Math.max(maxSpent, total);
                }
            }
        }
        return maxSpent;
    }

    public static void main(String[] args) {
        int[] keyboards = {10, 20, 30};
        int[] drives = {6, 10, 15};
        int b = 80;
        System.out.println(getMoneySpent(keyboards, drives, b));
    }
}
