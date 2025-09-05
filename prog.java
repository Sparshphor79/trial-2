// Base Class: RBI
class RBI {
    public float getSavingsInterestRate() {
        return 4.0f; // RBI minimum
    }
    public float getMinBalance() {
        return 500f;
    }
    public float getMaxWithdrawal() {
        return 25000f;
    }
}

// Derived classes
class SBI extends RBI {
    @Override
    public float getSavingsInterestRate() { return 4.5f; }
    @Override
    public float getMinBalance() { return 1000f; }
    @Override
    public float getMaxWithdrawal() { return 40000f; }
}

class ICICI extends RBI {
    @Override                               
    public float getSavingsInterestRate() { return 5.0f; }
    @Override
    public float getMinBalance() { return 2000f; }
    @Override
    public float getMaxWithdrawal() { return 60000f; }
}

class PNB extends RBI {
    @Override
    public float getSavingsInterestRate() { return 4.25f; }
    @Override
    public float getMinBalance() { return 500f; }
    @Override
    public float getMaxWithdrawal() { return 30000f; }
}

// Demo class
public class prog {
    public static void main(String[] args) {
        // RBI reference pointing to different bank objects (Dynamic Polymorphism)
        RBI bank;

        bank = new SBI();
        System.out.println("SBI -> Interest: " + bank.getSavingsInterestRate()
                + "% MinBalance: " + bank.getMinBalance()
                + " MaxWithdraw: " + bank.getMaxWithdrawal());

        bank = new ICICI();
        System.out.println("ICICI -> Interest: " + bank.getSavingsInterestRate()
                + "% MinBalance: " + bank.getMinBalance()
                + " MaxWithdraw: " + bank.getMaxWithdrawal());

        bank = new PNB();
        System.out.println("PNB -> Interest: " + bank.getSavingsInterestRate()
                + "% MinBalance: " + bank.getMinBalance()
                + " MaxWithdraw: " + bank.getMaxWithdrawal());
    }
}
