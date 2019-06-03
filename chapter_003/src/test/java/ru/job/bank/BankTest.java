package ru.job.bank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BankTest {

    private Bank bank = new Bank();

    /**
     * Test addUser.
     */
    @Test
    public void whenUserThenAddUser() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        String result = this.bank.getUserById("1234").getName();
        assertThat(result, is("John"));
    }

    /**
     * Test getUserById.
     */
    @Test
    public void whenPassportThenGetUser() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        User result = this.bank.getUserById("1234");
        assertThat(result, is(user));
    }

    /**
     * Test deleteUser.
     */
    @Test
    public void whenUserThenRemoveUser() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        this.bank.deleteUser(user);
        this.bank.deleteUser(user);
        User result = this.bank.getUserById("1234");
        User expected = null;
        assertThat(result, is(expected));
    }

    /**
     * Test addAccountToUser.
     */
    @Test
    public void whenUserThenAddAccountToUser() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        Account account1 = new Account(2000.00, "1131_2471_8365");
        Account account2 = new Account(5000.00, "7777_5555_1212");
        List<Account> expected = new ArrayList<>();
        expected.add(account1);
        expected.add(account2);
        this.bank.addAccountToUser("1234", account1);
        this.bank.addAccountToUser("1234", account2);
        List<Account> result = bank.getUserAccounts("1234");
        assertThat(result, is(expected));
    }

    /**
     * Test deleteAccountFromUser.
     */
    @Test
    public void whenUserThenRemoveAccountFromUser() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        Account account1 = new Account(2000.00, "1131_2471_8365");
        Account account2 = new Account(5000.00, "7777_5555_1212");
        List<Account> expected = new ArrayList<>();
        expected.add(account2);
        this.bank.addAccountToUser("1234", account1);
        this.bank.addAccountToUser("1234", account2);
        this.bank.deleteAccountFromUser("1234", account1);
        List<Account> result = this.bank.getUserAccounts("1234");
        assertThat(result, is(expected));
    }

    /**
     * Test getUserAccounts.
     */
    @Test
    public void whenUserThenGetAccounts() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        Account account1 = new Account(2000.00, "1131_2471_8365");
        Account account2 = new Account(5000.00, "7777_5555_1212");
        Account account3 = new Account(5000.00, "7997_5115_1212");
        List<Account> expected = new ArrayList<>();
        expected.add(account1);
        expected.add(account2);
        expected.add(account3);
        this.bank.addAccountToUser("1234", account1);
        this.bank.addAccountToUser("1234", account2);
        this.bank.addAccountToUser("1234", account3);
        List<Account> result = this.bank.getUserAccounts("1234");
        assertThat(result, is(expected));
    }

    /**
     * Test getUserOneAccount.
     */
    @Test
    public void whenUserThenGetOneAccount() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        Account account1 = new Account(2000.00, "1131_2471_8365");
        Account account2 = new Account(5000.00, "7777_5555_1212");
        Account account3 = new Account(5000.00, "7997_5115_1212");
        this.bank.addAccountToUser("1234", account1);
        this.bank.addAccountToUser("1234", account2);
        this.bank.addAccountToUser("1234", account3);
        Account result = this.bank.getUserOneAccount("1234", "7777_5555_1212");
        assertThat(result, is(account2));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenTwoUsersThenTransferMoneyToDifferentUser() {
        User user1 = new User("John", "1234");
        User user2 = new User("Helen", "0987");
        this.bank.addUser(user1);
        this.bank.addUser(user2);
        Account accountUser1 = new Account(5000.00, "1131_2471_8365");
        Account accountUser2 = new Account(0.00, "7777_5555_1212");
        this.bank.addAccountToUser("1234", accountUser1);
        this.bank.addAccountToUser("0987", accountUser2);
        this.bank.transferMoney(
                user1.getPassport(), accountUser1.getRequisites(),
                user2.getPassport(), accountUser2.getRequisites(), 1000.00);
        assertThat(accountUser2.getMoney(), is(1000.00));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenOneUserThenTransferMoneyToDifferentAccount() {
        User user = new User("John", "1234");
        this.bank.addUser(user);
        Account account1 = new Account(2000.00, "1131_2471_8365");
        Account account2 = new Account(0.00, "7777_5555_1212");
        this.bank.addAccountToUser("1234", account1);
        this.bank.addAccountToUser("1234", account2);
        this.bank.transferMoney(
                user.getPassport(), account1.getRequisites(),
                user.getPassport(), account2.getRequisites(), 1000.00);
        assertThat(account2.getMoney(), is(1000.00));

    }
}