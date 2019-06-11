/**
 * 链接：https://www.nowcoder.com/questionTerminal/fbcf95ed620f42a88be24eb2cd57ec54
 * 来源：牛客网
 *
 * [编程题]微信红包
 * 热度指数：22344时间限制：3秒空间限制：32768K
 *  算法知识视频讲解
 * 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
 *
 * 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
 *
 * 若没有金额超过总数的一半，返回0。
 * 测试样例：
 * [1,2,3,2,2],5
 * 返回：2
 * Java(javac 1.8)重置
 */


/**
 * 思想：用两层循环，用外层循环去遍历内层的数，相同的技术加一，内层循环遍历完成后，
 * 计数器和数组长度的一半进行比较，如果大于一半，直接返回完成循环的数，如果遍历完所有的数都没有一个数重复次数超过
 * 宏观个数的一半直接返回0
 */
public class FindOverHalfNumber {
    public static void main(String[] args) {
        int[] arr=new int[] {1,2,2,3,4};
        getValue(arr,5);
    }

        public static  int getValue(int[] gifts, int n) {
            for(int i=0;i<gifts.length;i++){
                int count=0;
                for(int j=0;j<gifts.length;j++){
                    if(gifts[i]==gifts[j]){
                        count++;
                    }
                }
                if(count>n/2){
                    return gifts[i];
                }
            }

            return 0;
        }

}
