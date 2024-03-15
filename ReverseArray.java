public class ReverseArray
{
  public static void main(String[] args)
  {
    int a[]= {1,4,2,4,2};
    System.out.println("Reversed elements of an array:");
    for(int i=a.length-1;i>=0;i--)
      {
        System.out.print(a[i]);
      }
  }
}
