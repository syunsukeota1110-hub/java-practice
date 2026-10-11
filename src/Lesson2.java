public class Lesson2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(7 / 2.0);
        System.out.println((double) a / b);

        int count = 10;
        count += 5;
        count++;

        System.out.println(count);

        int totalPrice = 10000;
        int people = 3;

        System.out.println("飲み会の合計金額は" + totalPrice + "です");
        System.out.println("人数は" + people + "です");
        System.out.println("一人あたり" + totalPrice / people + "円");
        System.out.println("余り" + totalPrice % people + "円");
        System.out.println("正確には一人" + (double) totalPrice / people + "円");
    }
}