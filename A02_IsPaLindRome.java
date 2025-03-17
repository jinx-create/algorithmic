package text01;

public class A02_IsPaLindRome {
    public static void main(String[] args) {
        int x = 12311;
        System.out.println(IsPalindrome(x));
    }
    public static boolean IsPalindrome(int x){
        //如果输入的数字 x 小于等于 0，则直接返回 false，因为负数和零不可能是回文数。
        //如果 x % 10 == 0，即数字以 0 结尾（但不是 0 本身），也不可能是一个回文数（例如 10、120 等）。
        if(x <= 0 || x % 10 == 0 ){
            return false;
        }
        //反转数字的一半
        int revertedNumber = 0;
        while (x > revertedNumber){
            //revertedNumber 通过累加 x % 10 来构建反转后的数字
            revertedNumber = revertedNumber * 10 + x % 10;
            //x 通过整除 10 去掉最后一位数字
            x = x / 10;
        }
        //判断是否是回文数
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
