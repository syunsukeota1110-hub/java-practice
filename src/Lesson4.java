public class Lesson4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "回目");
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("課題4:人数を変えた割り勘表");
        System.out.println("合計金額15000円を2人〜6人で割った場合の表を表示してください。");
        System.out.println("・各人数について「n人:1人あたりn円、余りn円」と表示");
        System.out.println("・余りが０の行だけ、末尾に「(ぴったり)」とつける");
        System.out.println("for文の中にfor文を入れる形になります。書けたら、for文の３つの部分の役割を自分の言葉で説明もしてください。");

        int totalPrice = 10000;
        for (int people = 2; people <= 6; people++) {
            int perPerson = totalPrice / people;
            int remainder = totalPrice % people;
            if (remainder==0){
            System.out.println(people + "人:1人あたり" + perPerson + "円、余り" + remainder + "円(ぴったり)");
            }
            else {
                System.out.println(people + "人:1人あたり" + perPerson + "円、余り" + remainder + "円");
            }

        }
        System.out.println("foe文の３つの部分の役割について。;によって役割を区切ることができる。");
        System.out.println("変数;変数がどれくらいになるまで処理するか;変数の変化ルール;の役割。");
        System.out.println("その下にfor文で定めたルール内に繰り返してほしいコードを書く。ってかんじ");
    }
}
