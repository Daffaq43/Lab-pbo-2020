class EnumExample1{
     public enum Season { WINTER, SPRING, SUMMER, FALL}
     
     public static void main(String[] args) {
         for (Season s : Season.values())
            System.out.println(s); 
     }
} 

/* Code di atas di buat untuk mencoba tipe data enum */