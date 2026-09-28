package bank;
public class homeloan extends loan implements discount {
   
    public double GetRate() {
        if(getPrincipal() <= 2000000) {
            return 10;
        } else {
            return 11;
        }
    }

    public double getDiscount(){
        return 0.05*getEmi();
    }

}
