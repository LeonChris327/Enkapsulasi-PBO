package Praktikum2;
public class Bola {
    private double jarijari;
  
  void setJariJari(double jari2){
    this.jarijari = jari2;
  }
  void showDiameter(){
    double res = this.jarijari * 2;
    System.out.println("Diameter: "+ res + " cm");
  }
  void showLuasPermukaan(){
    double res = 4 * Math.PI * Math.pow(this.jarijari, 2);
    System.out.println("Luas permukaan: "+ res + " cm kuadrat");
  }
  void showVolume(){
    double res = (4/3) * Math.PI * Math.pow(this.jarijari, 3);
    System.out.println("Volume: "+ res + " cm kubik");
  }
}

