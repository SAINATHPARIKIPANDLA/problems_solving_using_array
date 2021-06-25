public class Min_MAx
{
	public static void main(String[] args) {
	    int[] a={1000, 11, 445, 1, 330, 3000};
	    int temp;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=1;j<a.length-1;j++)
	        {
	            if(a[j-1]>a[j])
	            {
	                temp=a[j-1];
	                a[j-1]=a[j];
	                a[j]=temp;
	            }
	        }
	    }
	    int len=a.length;
	    for(int i=0;i<a.length;i++)
	    {
	         System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    for(int i=0;i<a.length/2;i++)
	    {
	       System.out.println(a[i]+" "+a[len-1 ]);
	       len--;
	         
	    }
	}
	
}
