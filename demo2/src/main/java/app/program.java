package app;
import bank.homeloan;
import bank.personalLoan;
class program{
    public static void main(String[] args) {
       
        homeloan h = new homeloan();
        personalLoan p = new personalLoan();
       
        h.setPrincipal(2000000);
        h.setPeriod(98);
       
        System.out.println("Home Loan EMI: " + h.getEmi());
        System.out.println("Home Loan Rate: " + h.GetRate());
        System.out.println("Home Loan Discount: " + h.getDiscount());

        p.setPrincipal(100000);
        p.setPeriod(12);
       
        System.out.println("Personal Loan EMI: " + p.getEmi());
        System.out.println("Personal Loan Rate: " + p.GetRate());
        System.out.println("Personal Loan Tax: " + p.getTax());

    }
}
