package Praktikum1;
public class Bus {
    private double penumpang, maxPenumpang;
    private int counter;
    public double penumpangBaru;
    

    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
   
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getPenumpang(int password){
        if(password==24){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    
    public double getAverage(){
        double average = penumpang / counter;
        return average;
    }
    
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
