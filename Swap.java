public  class Swap {
    
    public static void swap(int[] a , int[] b) {
        int[] temp= {0};
         temp[0]=a[0];
         a[0]=b[0];
         b[0]=temp[0];
        
    }
    public static void swap(Date a , Date b) {
        Date temp = new Date();
        temp.day = a.day;
        temp.month = a.month;
        temp.year = a.year;

        a.day = b.day;
        a.month = b.month;
        a.year = b.year;
        
        b.day = temp.day;
        b.month = temp.month;
        b.year = temp.year;
    }
    public static void main(String[] args) {
        // pass by value
        int[] a={10};
        int[] b={20};
        swap(a,b);
        System.out.println("After Swapping a : " + a[0] + "b: " + b[0]);

        Date d1 = new Date(1, "jan", 2000);
        Date d2 = new Date(2, "jan", 2000);

        swap(d1, d2);
        System.out.println("After Swapping date d1: " + d1 + "d2: " + d2);
    }
}
