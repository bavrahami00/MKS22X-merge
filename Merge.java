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
    merge(data,low,pivot,high);
  }
  public static void merge(int[] data, int low, int pivot, int high) {
    int[] temp = new int[data.length];
    for (int x = 0; x < low; x++) {
      temp[x] = data[x];
    }
    int first = low;
    int second = pivot;
    for (int x = low; x <= high; x++) {
      if (first != pivot && (data[first] < data[second] || second == high+1)) {
        temp[x] = data[first];
        first++;
      }
      else {
        temp[x] = data[second];
        second++;
      }
    }
    for (int x = high+1; x < data.length; x++) {
      temp[x] = data[x];
    }
    data = temp;
  }
}
