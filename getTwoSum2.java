package getSum;

public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;

        System.out.println(record(9,num));
    }
    public static int[] record(int target ,int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if(num[i] + num[j] == target ){
                   return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
