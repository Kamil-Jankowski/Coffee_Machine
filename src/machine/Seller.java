package machine;

class Seller extends Worker {

    Seller(Moneybox cash) {
        super(cash);
    }

    @Override
    void take(){
        System.out.printf("I gave you $%d\n", cash.getMoney());
        cash.setMoney(0);
    }
}
