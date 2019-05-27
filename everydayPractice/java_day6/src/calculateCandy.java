import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/02d8d42b197646a5bbd0a98785bb3a34
 * 来源：牛客网
 *
 * 编程题]计算糖果
 * 热度指数：18528时间限制：1秒空间限制：32768K
 *  算法知识视频讲解
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 *
 * 输入描述:
 * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
 *
 *
 * 输出描述:
 * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
 * 示例1
 * 输入
 * 1 -2 3 4
 * 输出
 * 2 1 3
 */
public class calculateCandy {
        public static void main(String[] aegs){
            Scanner in=new Scanner(System.in);
            while(in.hasNextInt()){
                int a=in.nextInt();
                int b=in.nextInt();
                int c=in.nextInt();
                int d=in.nextInt();
                float A=(a+c)/2f;
                float B=(c-a)/2f;
                float C=(d-b)/2f;
                if((A-(a+c)/2)!=0){
                    System.out.println("No");
                    return;
                }
                if((B-(c-a)/2)!=0&&(B-(b+c)/2)!=0){
                    System.out.println("No");
                    return;
                }
                if((C-(d-b)/2)!=0){
                    System.out.println("No");
                    return;
                }
                System.out.println((int)A+" "+(int)B+" "+(int)C);
            }
        }
    }

