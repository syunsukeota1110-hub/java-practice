public class Lesson5 {
    public static void main(String[] args) {
        int money = 0;
        int day = 0;
        while (money < 10000) {
            System.out.println(day + "日目　" + money + "円");
            day++;
            money += 500;
        }
        System.out.println(day + "日目で" + money + "円になりました");
    }
}
