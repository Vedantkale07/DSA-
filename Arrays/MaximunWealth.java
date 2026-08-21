package Arrays;

//
//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.
//
//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.

public class MaximunWealth {

    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1},{2,4,6}};
        System.out.println(maxWealth(accounts));
    }

    public static int  maxWealth(int [][] accounts){
        int maxWealth= Integer.MIN_VALUE;

        // person= row
        // account= col

        for (int person = 0; person < accounts.length; person++) {

            int rowSum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            // check rowsum is grether than other rowsum if yes  max Wealth row
            if(rowSum> maxWealth){
                maxWealth= rowSum;
            }
        }
        return maxWealth;
    }
}
