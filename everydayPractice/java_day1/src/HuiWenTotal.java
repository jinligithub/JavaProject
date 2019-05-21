import java.util.Scanner;

public class HuiWenTotal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        String s1=in.nextLine();
        String s2=in.nextLine();
        for(int i=0;i<s1.length();i++){
            int left=0;
            int right=s1.length()+s2.length()-1;
            String  s3=s1.substring(0,i)+s2+s1.substring(i);
            while(left<right&&s3.charAt(left)==s3.charAt(right)){
                left++;
                right--;
            }
            if(s3.charAt(left)==s3.charAt(right))
                count++;

        }
        System.out.println(count);
    }

}
