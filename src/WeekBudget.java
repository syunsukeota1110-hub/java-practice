public class WeekBudget {
    public static void main(String[] args) {
        int[] week = {800, 1500, 600, 2300, 700, 1200, 900};
        int budget = 7000;      // 1週間の予算
        int dailyLimit = 1000;  // 1日の上限

        // ① sumを呼んで合計を出し、「合計：◯円」と表示
        int total =sum(week);
        System.out.println("合計："+total+"円");
        // ② 合計が予算を超えていたら「予算を◯円オーバーしています」
        if (total > budget){
            int weekover = total - budget;
            System.out.println("予算を" + weekover + "円オーバーしています");
            //    超えていなければ「残り◯円です」と表示
        }else {
            int notover = budget - total;
            System.out.println("残り" + notover + "円です");
        }
        // ③ countOverを呼んで「1000円を超えた日：◯日」と表示
        int counts = countOver(week,dailyLimit);
        System.out.println(dailyLimit+"円を超えた日："+counts+"日");
    }

    static int sum(int[] nums) {
        int total=0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        // 配列の中身を全部足して返す
        return total;
    }

    static int countOver(int[] nums, int limit) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > limit){
                count++;
            }
        }
        // limitを超えた数がいくつあるか数えて返す
        return count; // ←仮の答え。中身を書いたら消す
    }
}