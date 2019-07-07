import java.util.Scanner;

public class TotalNum {
        public static void main(String[] args ){

            Scanner in=new Scanner(System.in);
            while(in.hasNextLine()){
                int num=in.nextInt();
                int num2=num*num;
                if(num>40000||num<0)
                    return;
                int sum1=0;
                int sum2=0;
                sum1 =TolNum(num);
                sum2=TolNum(num2);
                System.out.print(sum1+" ");
                System.out.print(sum2);
            }
        }
        public static int TolNum(int num){
            int sum=0;
            while(num>=1){
                int a=num%10;
                sum+=a;
                num/=10;
            }
            return sum;
        }
    }

