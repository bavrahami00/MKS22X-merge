public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data,0,data.length-1);
  }
  public static void mergesort(int[] data, int low, int high) {
    if (low >= high) {
      return;
    }
    int pivot = low+(high-low)/2+1;
    mergesort(data,low,pivot-1);
    mergesort(data,pivot,high);
    int[] temp = new int[data.length];
    int count = 0;
    for (int x = 0; x < temp.length; x++) {
      if (data[count] <= data[pivot] && count <= low+(high-low)/2) {
        temp[x] = data[count];
        count++;
      }
      else {
        temp[x] = data[pivot];
        pivot++;
      }
    }
    data = temp;
  }
}
