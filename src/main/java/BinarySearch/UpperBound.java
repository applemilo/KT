package BinarySearch;

public class UpperBound {

    //(]
    public int approach1(int[] arr, int target){
        int l=-1, r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2+1;
            if(arr[m]>target){
                r=m-1;
            }else{
                l=m;
            }
        }
        return l;
    }

    //()
    public int approach2(int[] arr, int target){
        int l=-1, r=arr.length;
        while(l<r-1){
            int m=l+(r-l)/2;
            if(arr[m]>target){
                r=m;
            }else{
                l=m;
            }
        }
        return l;
    }

    //[]
    public int approach3(int[] arr, int target){
        int l=0, r=arr.length-1;
        while(l<r-1){
            int m=l+(r-l)/2;
            if(arr[m]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l-1;
    }

    //[)
    public int approach4(int[] arr, int target){
        int l=0, r=arr.length;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>target){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l-1;
    }
}
