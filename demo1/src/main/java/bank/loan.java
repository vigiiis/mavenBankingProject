package bank;
public abstract class loan {
    private double principal;
    protected double period;

   

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getPeriod() {
        return period;
    }

    public abstract double GetRate();

    public double getEmi(){
        return principal * (1+GetRate() *period/100)/(12*period);
    }

    
}