import java.util.Scanner;

//https://www.nowcoder.com/practice/fe298c55694f4ed39e256170ff2c205f?tpId=37&&tqId=21245&rp=1&ru=/activity/oj&qru=/ta/huawei/question-ranking

/**
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
 * 她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
 * 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝
 * 掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * 输入描述:
 * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。
 * n=0表示输入结束，你的程序不应当处理这一行。
 *
 * 输出描述:
 * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 *
 * 示例1
 * 输入
 * 复制
 * 3
 * 10
 * 81
 * 0
 * 输出
 * 复制
 * 1
 * 5
 * 40
 */
public class totalBottle{
    public static void main(String[] args){

    }
     public static void total2(){
         //递归方法
         Scanner in = new Scanner(System.in);
         while (in.hasNext()) {
             int num = in.nextInt();//获取下一个测试用例
             if(num==0){//如果瓶子数为0，直接返回0
                 System.out.println(0);
             }
             int count=0;//能喝的饮料数目
             //while(num>2)
             while(num/3>=1){//如果喝的空瓶子数剩下的大于1,
                 count=num/3+count;
                 num=num/3+num%3;
             }
             if(num==2){//当瓶子数等于2时，瓶子数加一
                 count++;
             }
             System.out.println(count);
         }
     }
    public static void total1(){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String s1=in.nextLine();
            int num=Integer.parseInt(s1);
            System.out.println(num/2);
        }
    }
}