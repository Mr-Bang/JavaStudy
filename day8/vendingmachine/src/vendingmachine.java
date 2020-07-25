public class vendingmachine
{
    int price = 80;
    int balance;
    int total;
    void showPrompt()
    {
        System.out.println("welcome");
    }
    void insertMoney(int amount)
    {
        balance +=amount;
    }
    void showBalance()
    {
        System.out.println("Balance is "+ balance);
    }
    void getFood()
    {
        if(balance>=price){
            System.out.println("here you are");
            balance -=price;}
        else
        {
            System.out.println("Balance is not enough");
        }
    }
    public static void main(String[] args)
    {
        vendingmachine vm =new vendingmachine();
        vm.price = 25;
        vm.showPrompt();;
        vm.insertMoney(100);
        vm.showBalance();
        vm.getFood();
        vm.showBalance();
    }
}
