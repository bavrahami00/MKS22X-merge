public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data,0,data.length-1);
  }
  public static void mergesort(int[] data, int low, int high) {
    if (low >= high) {
      return;
    }
    mergesort(data,low,(high+low)/2);
    mergesort(data,(high+low)/2+1,high);
    merge(data,low,(high+low)/2+1,high);
  }
  public static void merge(int[] data, int low, int pivot, int high) {
    int[] temp = new int[data.length];
    int first = low;
    int second = pivot;
    for (int x = low; x <= high; x++) {
      if (first != pivot && (second == high+1 || data[first] < data[second])) {
        temp[x] = data[first];
        first++;
      }
      else {
        temp[x] = data[second];
        second++;
      }
    }
     for (int x = low; x <= high; x++) {
        data[x] = temp[x];
     }
  }
}
