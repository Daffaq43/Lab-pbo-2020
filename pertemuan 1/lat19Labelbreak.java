public class lat19Labelbreak {

    public static void main(String arg[]){

        int a, b;
        Mulai:
        for(a=0; a<2; a++){
            for(b=0; b<3; b++){
                if(b==2)
                    break Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
} 

/* program ini menampilkan hasil dari pelebelan pada statement break */