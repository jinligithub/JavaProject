import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/f0db4c36573d459cae44ac90b90c6212?orderByHotValue=0&page=1&onlyReference=false
 * 来源：牛客网
 *
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 *
 * 输入描述:
 * 每个测试输入包含2个字符串
 *
 *
 * 输出描述:
 * 输出删除后的字符串
 * 示例1
 * 输入
 * They are students. aeiou
 * 输出
 * Thy r stdnts.
 */
public class deleteChars {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            while(in.hasNextLine()){
                String s1=in.nextLine();
                String s2=in.nextLine();
                StringBuffer str=new StringBuffer();
                for(int i=0;i<s1.length();i++){
                    /**
                     * charAt():获取对应索引的字符
                     * valueOf():返回 char参数的字符串 char形式
                     */
                    String s=s1.valueOf(s1.charAt(i));
                    //只要s1中的字符在s2中在出现了，就不把该字符放入结果Str中
                    if(!s2.contains(s)){
                        str.append(s1.charAt(i));
                    }
                }
                System.out.println(str);

            }
        }
    }
