import java.util.Scanner;

public static void main(String[] args) {
    
    int[] a = { 7, 8, 9, 10, 1, 6, 2, 4, 3, 5};
    insertSort(a, a.length);
    
    for(int i : a)
    System.out.print(i + " ");
    System.out.println();
}

static void insertSort(int[] a, int num) {
    
    for(int j=1; j<num; j++) {
        
        int t = a[j], i = j;
        
        while(i > 0 && a[i-1] > t) {
            a[i] = a[i-1];
            i--;
            
        }
            
            a[i] = t;
            
    }
            
}

