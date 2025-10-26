class Bank {
    private long[] balances;
    private int accounts;

    public Bank(long[] balance) {
        this.accounts = balance.length;
        this.balances = new long[accounts];
        for (int i = 0; i < accounts; i++) {
            this.balances[i] = balance[i];
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (account1 >= 1 && account1 <= accounts && account2 >= 1 && account2 <= accounts) {
            if (balances[account1 - 1] >= money) {
                balances[account1 - 1] -= money;
                balances[account2 - 1] += money;
                return true;
            }
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if (account >= 1 && account <= accounts) {
            balances[account - 1] += money;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if (account >= 1 && account <= accounts) {
            if (balances[account - 1] >= money) {
                balances[account - 1] -= money;
                return true;
            }
        }
        return false;
    }
}