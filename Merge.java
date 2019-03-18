public class Merge {
  public static void mergesort(int[] data) {
    int dist = 2;
    while (dist < data.length*2) {
      for (int x = 0; x < data.length; x += dist) {
        merge(data,x,x+dist/2,x+dist);
      }
      dist *= 2;
    }
  }
  public static void merge(int[] data, int low, int pivot, int high) {
    if (high > data.length) {
      high = data.length;
    }
    if (pivot >= data.length) {
      pivot = data.length-1;
    }
    int[] temp = new int[data.length];
    int first = low;
    int second = pivot;
    for (int x = low; x < high; x++) {
      if (first != pivot && (second == high || data[first] < data[second])) {
        temp[x] = data[first];
        first++;
      }
      else {
        temp[x] = data[second];
        second++;
      }
    }
    for (int x = low; x < high; x++) {
       data[x] = temp[x];
    }
  }
}

