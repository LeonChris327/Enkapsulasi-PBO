package latihan2;
public class UjiBus {
    public static void main(String[] args) {
        
        //buat objek dari kelas Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //pertambahan penumpang
        busBesar.addPenumpang(15);//bertambahn 15 penumpang 
        busBesar.cetak();
        
        //pertambahan penumpang
        busBesar.addPenumpang(5);//bertambah 4 penumpang 
        busBesar.cetak();
        
        //pertambahan penumpang
        busBesar.addPenumpang(26);//bertambah 26 penumpang 
        busBesar.cetak();
    }
    
}
