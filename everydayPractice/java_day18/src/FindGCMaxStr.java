import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/e8480ed7501640709354db1cc4ffd42a
 * 来源：牛客网
 *
 * [编程题]DNA序列
 * 热度指数：12394时间限制：1秒空间限制：32768K
 *  算法知识视频讲解
 * 一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。
 *
 * 给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出GC-Ratio最高的子序列。
 *
 * 输入描述:
 * 输入一个string型基因序列，和int型子串的长度
 *
 * 输出描述:
 * 找出GC比例最高的子串,如果有多个输出第一个的子串
 *
 * 示例1
 * 输入
 * AACTGTGCACGACCTGA
 * 5
 * 输出
 * GCACG
 *
 */
public class FindGCMaxStr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.next();
            int n=in.nextInt();;
            int index=0;
            int max=0;
            if(str.length()<n){
                System.out.println(str);
                return;
            }
            for(int i=0;i<str.length()-n;i++){
                int total=0;
                String s=str.substring(i,i+n);
                for(int j=0;j<s.length();j++){
                    if(s.valueOf(s.charAt(j)).equals("G")||s.valueOf(s.charAt(j)).equals("C")){
                        total++;
                    }
                }
                if(total>max){
                    max=total;
                    index=i;
                }
            }
            System.out.println(str.substring(index,index+n));
        }    }
}
