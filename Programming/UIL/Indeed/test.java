class test {
  public static void main(String[] args) {
    int []arr = {4, 6, 1, 2};
    p(arr.length + "\n");
    sort(arr);
    for (int i = 0; i < arr.length; i++)
    {
      p(arr[i]);
    }
    p("\n");
  }
  public static void sort(int [] A)
  {
    for (int i = 1; i < A.length; i++)
    {
      int j = i;
      while ((j >= 1) && (A[j-1] > A[j]))
      {
        int hand = A[j];
        A[j] = A[j-1];
        A[j-1] = hand;
        j--;
      }
    }
  }
  public static <T> void p(T arr)
  {
    System.out.println(arr);
  }
}
