
package latihan4;
public class UjiBus3 {
    public static void main(String[] args) {
        
        Bus3 Bus = new Bus3(5);
        
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addPenumpang(1);//tambah 1 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }
    
}
