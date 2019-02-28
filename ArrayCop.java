class ArrayCop
{
public static void main(String s[])
{
	int i;
	int a[] = {10,20,30,40,50};
	int b[] = new int[a.length];
	//elements of array A;
	System.out.println("Elements of Array 2 : ");
// copying one to another
for(i =0;i<a.length;i++)
{
	b[i]=a[i];
}	
//printing array
for(i=0;i<b.length;i++)
{
	System.out.println(b[i]+" ");
}
}
}