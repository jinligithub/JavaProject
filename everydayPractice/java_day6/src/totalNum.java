import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/eac8c671a0c345b38aa0c07aba40097b
 * 来源：牛客网
 *
 * [编程题]n个数里出现次数大于等于n/2的数
 * 热度指数：17092时间限制：1秒空间限制：32768K
 *  算法知识视频讲解
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 *
 * 输入描述:
 * 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 *
 *
 * 输出描述:
 * 输出出现次数大于等于n/2的数。
 * 示例1
 * 输入
 * 3 9 3 2 5 6 7 3 2 3 3 3
 * 输出
 * 3
 */
public class totalNum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        //利用split（）方法，把字符串变为字符数组
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
            //统计衣服出现的次数
            int count=0;
            for(int j=0;j<s.length;j++){
                //比较字符
                if(s[i].equals(s[j])){
                    count++;
                }
            }
            //如果字符出现次数大于等于数组的长度的一半
            if(count>(s.length/2)){
                System.out.println(s[i]);
                break;
            }
        }
    }
}
