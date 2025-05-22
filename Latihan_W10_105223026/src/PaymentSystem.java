class PaymentMethod {
    public void processPayment(double amount){
        System.out.println("memproses pembayaran sebesar " + amount + " dengan metode default");
    }

    public void processPayment(double amount, String currency){
        System.out.println("memproses pembayaran sebesar " + amount + " " + currency + " dengan metode default");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("[Credit Card] Pembayaran sebesar " + amount + " telah diproses");
    }

    public void processPayment(double amount, String currency){
        System.out.println("[Credit Card] Pembayaran sebesar " + amount + " dalam mata uang " + currency + " telah diproses");
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("[E-Wallet] Pembayaran sebesar " + amount + " telah diproses");
    }

    public void processPayment(double amount, String currency){
        System.out.println("[E-Wallet] Pembayaran sebesar " + amount + " dalam mata uang " + currency + " telah diproses");
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("[Bank Transfer] Pembayaran sebesar " + amount + " telah diproses");
    }

    public void processPayment(double amount, String currency){
        System.out.println("[Bank Transfer] Pembayaran sebesar " + amount + " dalam mata uang " + currency + " telah diproses");
    }
}

public class PaymentSystem {
    public static void main(String[] args){
        PaymentMethod[] methods = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer(),
            new PaymentMethod()
        };

        for (PaymentMethod method : methods){
            method.processPayment(100.0);
            method.processPayment(200.0, "USD");
            System.out.println();
        }
    }
}