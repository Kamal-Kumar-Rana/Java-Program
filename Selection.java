import java.util.*;
public class Selection {


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] a= new int[20];
System.out.println("Enter number of Element:: ");
int n=sc.nextInt();
System.out.println("Enter Element:: ");

for(int i=0;i<n-1;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{


int temp;
int min=i;
for(int j=i+1;j<=(n);j++)
{
if(a[min]>a[j])
{
min=j;
}
temp=a[min];
a[min]=a[i];
a[i]=temp;
}

}
System.out.println("The Elements are is bellow:: ");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}