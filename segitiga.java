public class segitiga {
    public static void main(String[] args) {
        //inisialisasi ukuran segitiga
        int angka = 5;
        
        //segitiga siku-siku dari kiri
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //segitiga siku-siku terbalik dari kiri
        for (int i = 0; i < angka; i++) {
            for (int j = angka; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        //segitiga siku-siku dari kanan
        for (int i = 0; i < angka; i++) {
            for (int j = angka; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        //segitiga siku-siku terbalik dari kanan
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            
            for (int k = angka; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //segitiga sama sisi
        for (int i = 0; i < angka; i++) {
            for (int j = angka; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        //segitiga sama sisi terbalik
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = angka; k > i; k--) {
                System.out.print("*");
            }
            
            for (int l = angka-1; l > i; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
