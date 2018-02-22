/*You are given n-keys and an integer k such that 1<=k<=n.Give an efficient algorithm
to find any one of the k smallest keys.(For example,if k=3 the algorithms may provide
the first-,second- or the third smallest key.It need not know the exat rank of the key it
outputs)How many key comparisons does your algorithm do?
*/
import javax.swing.*;
public class Seminari
{	public static int k_smallestKey(int[] n)
	{	int k = new Integer(JOptionPane.showInputDialog("jepe celsin k")).intValue();
		int[] ans = new int[k];	
		int i = 0;
		int j = 0;
		int m = 0;
		for(i =0;i<n.length;i++)
		{	for(m = i+1;m<n.length;m++)	
			if(n[i]>n[m])
			{ int temp = n[i];
			  n[i] = n[m];
			  n[m]= temp;
			}
		}
		for(j =0;j<k;j++)
		{	ans[j] = n[j];
		}
int key = new Integer(JOptionPane.showInputDialog("cilin k-smallest key deshironi ?")).intValue();
	if(key==j) 
	{}
	return ans[key-1];

	}
public static void main(String[] args)
{	int[] n = {22,6,19,20,33,64};// 6 19 20 22 33 64
	int ans =k_smallestKey(n);
	System.out.print(ans+" eshte k-smallest key nga n-numrat e dhene ne varg");
}
}
/*b) Give a lower bound,as o function of n and k,on the number of comparisons needed to
	slove this problem,
	zgjidhje: funksioni i kerkuar eshte: n+ |lgn| -k]
	
	* |lgn| - ceiling of n
*/