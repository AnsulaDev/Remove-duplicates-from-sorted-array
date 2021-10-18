 class Removeduplicates {
    static int remove(int a[],int n){
        int res=1;
        for(int i=1; i<n;i++){
            if(a[i] != a[res-1]){
                a[res]=a[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int a[]={10,20,20,30,30,30};
        int n=6;
        System.out.println(remove(a,n));
    }
}
