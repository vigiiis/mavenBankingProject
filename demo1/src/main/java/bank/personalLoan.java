package bank;
public class personalLoan extends loan implements taxable {
    public double GetRate() {
        if(getPrincipal() <= 100000) {
            return 12;
        } else {    
            return 13;
        }
    }   
    public double getTax() {
        return 0.1*getEmi();
    }
}