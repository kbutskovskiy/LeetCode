package integer_reverse;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Solution {

    public static int reverse(int x) {
        long r=0;
        boolean neg = x < 0;
        while(abs(x)>0){
            r=r*10+abs(x%10);
            x=x/10;
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        if (neg){
            r*=-1;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-231));
    }
}
