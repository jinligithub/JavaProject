/**
 * 链接：https://www.nowcoder.com/questionTerminal/9fe25b6cf93e46dcb09ba67aeef2c4cc
 * 来源：牛客网
 *
 * 一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。该计划如下：我每天给你10 万元，你第一天给我1 分钱，第二天2 分钱，
 * 第三天4 分钱……
 * 这样交换 30 天后，百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）
 *
 * 输入描述:
 * 该题没有输入
 *
 *
 * 输出描述:
 * 输出两个整数，分别代表百万富翁交出的钱和陌生人交出的钱，富翁交出的钱以万元作单位，陌生人交出的钱以分作单位。
 * 示例1
 * 输入
 * 输出
 */
public class TotalMoney {
    public static void main(String[] args) {
                System.out.print(10*30);
                System.out.print(" ");
                System.out.println((int)Math.pow(2,30)-1);
    }
}
