public class lat16Loopdowhile{

    public static void main (String[] args){
        int a = 0;
        do{
            int i = 0;
            while (i<a+1){
                System.out.print("*");
                i++;
            }
            System.out.println();
            a++;
        }while (a < 10);
    }
}  

/* proses ini melibatkan konsep looping pada do-while */