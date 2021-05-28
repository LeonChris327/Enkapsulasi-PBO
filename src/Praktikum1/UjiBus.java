package Praktikum1;
public class UjiBus {
public static void main(String[] args) {
      
        Bus Bus = new Bus(100);
        Bus.getPenumpang(48);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
      
        System.out.println();
   
        
        Bus.addPenumpang(30);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
    
        System.out.println();
        
     
        Bus.addPenumpang(40);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        System.out.println();
        
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
    
}
