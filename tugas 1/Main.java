import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("-----BUS TRANS KOETARADJA Banda Aceh------");
        String nama;
        int umur;
        String hamil;
        boolean status;
        while(true){
            System.out.println("Menu :");
            System.out.println("1. penumpang naik bus");
            System.out.println("2. penumpang turun");
            System.out.println("3. Data penumpang");
            System.out.println("4. keluar dari program bus");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println();
            input.nextLine();
            if(pilihan==1){
                        System.out.print("Nama penumpang: ");
                        nama = input.nextLine();
                        System.out.print("Umur: ");
                        umur = input.nextInt();
                        input.nextLine();
                        System.out.print("anda sedang Hamil?(iya/tidak) : ");
                        hamil = input.nextLine();
                        if(hamil.equalsIgnoreCase("iya")){
                            status = true;
                        }else{
                            status = false;
                        }
                        Penumpang pen = new Penumpang(nama, umur, status);
                        System.out.println(bus.NaikPenumpang(pen) ? "Penumpang telah ditambah!":"Penumpang tidak bisa ditambahkan (penuh)!");
                    }else if(pilihan==2){
                        System.out.print("Nama penumpang : ");
                        nama = input.nextLine();
                        System.out.println(bus.turunkanPenumpang(nama) ? "Penumpang telah turun!":"Penumpang tidak terdata!");
                    }else if(pilihan==3){
                        System.out.println(bus.toString());
                    }else if(pilihan==4){
                       System.out.print("TERIMAKASIH TELAH MEMILIH TRANS KUTARAJA, SAMPAI JUMPA");
                       System.exit(4);
                    }
            
            

            System.out.println("(===========END=============)");
           
        }
    }
}