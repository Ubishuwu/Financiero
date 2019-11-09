public class Financiero
{
    private double sueldo[] = new double []{100.00,489.12,12454.12,1234.10,
                                            823.05,109.20,5.27,1542.25,839.18,
                                            83.99,1295.01,1.75};
    public void calcularSaldo(){
     double dineropromedio=0;
     for(int i=0;i<sueldo.length;i++){
      dineropromedio=dineropromedio+sueldo[i];
     }
     dineropromedio=dineropromedio/12;
     System.out.println("$"+dineropromedio);
    }
    
    public static void main(String[] args){
    Financiero Larry = new Financiero();
    Larry.calcularSaldo();
    }
}
