package BinarySearch;

public class LowerBound {
  // (]
  public int approach1(int[] arr, int target) {
    int l = -1, r = arr.length - 1;
    while(l<r) {
      int m = l + (r-l)/2 + 1;
      if(arr[m]<target){
        l=m;
      }else {
        r=m-1;
      }
    }
    return l + 1;
  }

  // ()
  public int approach2(int[] arr, int target) {
    int l = -1, r = arr.length;
    while(l<r-1) {
      int m = l + (r-l)/2;
      if(arr[m]<target){
        l=m;
      }else {
        r=m;
      }
    }
    return r;
  }

  // []
  public int approach3(int[] arr, int target) {
    int l = 0, r = arr.length-1;
    while(l<=r) {
      int m = l + (r-l)/2;
      if(arr[m]<target){
        l=m+1;
      }else {
        r=m-1;
      }
    }
    return l;
  }

  // [)
  public int approach4(int[] arr, int target) {
    int l = 0, r = arr.length;
    while(l<r) {
      int m = l + (r-l)/2;
      if(arr[m]<target){
        l=m+1;
      }else {
        r=m;
      }
    }
    return l;
  }
}