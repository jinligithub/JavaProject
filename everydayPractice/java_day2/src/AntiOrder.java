
import java.util.*;

/**
 * 方法一：用count记录数对，利用两层循环，用外层循环的每个数和内层循环的每个数进行比较，只要外层循环比内侧循环的数大，count++
 */
public class AntiOrder {
    public int count(int[] A, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            int max=A[i];
            for(int j=i+1;j<n;j++){
                if(max>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}