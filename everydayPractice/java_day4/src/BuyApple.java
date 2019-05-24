import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
 * 来源：牛客网
 *
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
 *
 * 输入描述:
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 *
 *
 * 输出描述:
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 */
public class BuyApple {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            while(in.hasNextInt()){
                int n=in.nextInt();
                System.out.println(count(n));
            }
        }
        public static int count(int n){
            //排除不是偶数，最小是6 在，10以上的偶数
            if(n%2!=0||n==10||n<6)
                return -1;
            //刚好用装八个袋子的都能装完
            if(n%8==0)
                return n/8;
            //对于10以上的偶数，只要对吧求余不为0，就要从前边的一个或者两个袋子中拿出2个把余数补6
            //如果余数本来就为6，就不用拿
            return 1+n/8;
        }
    }

