package arr;

public class countGoodTriplets {
    /*
    给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
    如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
• 0 <= i < j < k < arr.length
• |arr[i] - arr[j]| <= a
• |arr[j] - arr[k]| <= b
• |arr[i] - arr[k]| <= c
    其中 |x| 表示 x 的绝对值。
    返回 好三元组的数量 。
    */


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int a = 0;
        int b = 0;
        int c = 1;
        int solution = solution2(arr, a, b, c);
        System.out.println(solution);
    }

    public static int solution1(int[] arr, int a, int b, int c){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if((arr[i] - arr[j] <= a && -a <= arr[i] -arr[j]) &&
                            (arr[j] - arr[k] <= b && -b <= arr[j] -arr[k]) &&
                            (arr[i] - arr[k] <= c && -c <= arr[i] -arr[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int solution2(int[] arr, int a, int b, int c){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                    }
                }
            }
        }
        return count;
    }


   /* public static int solution1(int[] arr, int a, int b, int c){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length ; j++) {
                for (int k = 2; k < arr.length; k++) {
                    if((arr[i] - arr[j] <= a || -a <= arr[i] -arr[j]) &&
                            (arr[j] - arr[k] <= b || -b <= arr[j] -arr[k]) &&
                            (arr[i] - arr[k] <= c || -c <= arr[i] -arr[k])){
                        count++;
                    }
                }
            }
        }
        }
        return count;*/
   /* 主要错误
    1.  索引初始化错误： ◦  j从1开始，k从2开始，这样会漏掉很多有效的三元组组合  ◦
    正确的应该是j = i + 1和k = j + 1，确保i < j < k的顺序
    2.  绝对值条件实现错误： ◦  使用(x <= a || -a <= x)来实现|x| ≤ a是不正确的逻辑  ◦
    正确的应该是(x <= a && x >= -a)或者直接使用Math.abs(x) <= a
    3.  三元组重复计数： ◦  由于索引初始化不当，会导致某些三元组被多次计数  ◦
    例如，当i=0,j=1,k=2和i=0,j=1,k=3等会被正确计数，但其他组合会被遗漏*/


    }

