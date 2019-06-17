import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
 * 来源：牛客网
 *
 * 编程题]统计每个月兔子的总数
 * 热度指数：23792时间限制：1秒空间限制：32768K
 *  算法知识视频讲解
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 *
 *
 *     /**
 *      * 统计出兔子总数。
 *      *
 *      * @param monthCount 第几个月
 *      * @return 兔子总数
 *
 * 输入描述:
 * 输入int型表示month
 *
 *
 *
 * 输出描述:
 * 输出兔子总数int型
 *
 * 示例1
 * 输入
 * 9
 * 输出
 * 34
 *
 *      */


/**
 * 做题思路：它是一个青蛙跳台阶的变形，
 * 生兔子的规律：1 1 2 3 5 8 ...
 *
 * 方法一递归方法：
 * 所以当月数等于1 或2 时直接后返回1
 * 大于2时，返回getTotalCount(month-1)+gettotalMnth(month-2)
 *
 * 方法二：非递归方法
 */

public class getTotalMonth {

        public static void main(String [] args){
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                int month=in.nextInt();
                System.out.println(getTotalCount2(month));
            }
        }
        //方法一：递归方法
        public static int  getTotalCount1(int n){
            if(n==1 || n==2)
                return 1;
            else
                return getTotalCount1(n-1)+getTotalCount1(n-2);
        }

        //方法二：非递归方法
        public static int getTotalCount2(int n){
            int count=0;
            if(n==1||n==2)
                return 1;
            int month1=1;
            int month2=0;
            int month3=0;
            for(int i=2;i<=n;i++){
                month3=month2+month3;
                month2=month1;
                month1=month3;
            }
            return month1+month2+month3;
        }

}
