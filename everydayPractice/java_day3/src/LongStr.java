import java.util.Scanner;
import java.util.*;
public class LongStr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            StringBuffer sb=new StringBuffer();
            StringBuffer result=new StringBuffer();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                    if(sb.length()>result.length()){
                        result=sb;
                    }
                }else{
                    sb=;
                }
            }
            System.out.println(result);
        }
    }
    public static void Str1(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                    str=str.replace(str.charAt(i),'#');
                    // System.out.println(str);
                }
            }
            System.out.println(sb);
        }
    }
}


