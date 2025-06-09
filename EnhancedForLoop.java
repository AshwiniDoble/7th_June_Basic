public class EnhancedForLoop {
    public static void main(String[] args) {
        /* 
                int nums[] = new int[3];
                nums[0]=2;
                nums[1]=5;
                nums[2]=7;

                for (int n: nums)
                {
                    System.out.println(n);
                } 
        
        */ 

        int arr[] = new int[3];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random()*10);
        }

        for(int n : arr)
        {
            System.out.println(n);
        }
    }
}
