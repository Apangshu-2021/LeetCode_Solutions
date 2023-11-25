class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int r_sum=0;
        int l_sum=0;
        int n=arr.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++)
        {
            r_sum+=arr[i];
        }

        for(int i=0;i<n;i++)
        {
            r_sum-=arr[i];
            int r_len=n-i-1;
            int l_len=i;
            res[i]=(arr[i]*l_len-l_sum)+(r_sum-arr[i]*r_len);
            l_sum+=arr[i];
        }

        return res;
    }
}