public class Lesson3 {
    public static void main(String[] args) {
        int score = 75;

        System.out.println("結果は" + score + "点です");

        if (score >= 80) {
            System.out.println("評価A");
        } else if (score >= 60) {
            System.out.println("評価B");
        } else {
            System.out.println("評価C");
        }

        int totalPrice = 50536;
        int people = 12;
        int perPerson = totalPrice / people;
        int remainder = totalPrice % people;

        System.out.println("飲み会の合計金額は" + totalPrice + "です");
        System.out.println("人数は" + people + "です");
        System.out.println("一人あたり" + perPerson + "円");
        System.out.println("余り" + remainder + "円");
        System.out.println("正確には一人" + (double) totalPrice / people + "円");

        if (remainder == 0) {
            System.out.println("ぴったり割り切れました");
        } else {
            System.out.println("幹事が" + remainder + "円多く払います");
        }
        if (perPerson >= 5000) {
            System.out.println("高めの会です");
        } else {
            System.out.println("お手頃な会です");
        }
    }
}
