package ru.job.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<User, List<Account>> bank = new HashMap<>();

    public void addUser(User user) {
        List<Account> users = new ArrayList<>();
        bank.putIfAbsent(user, users);
    }

    public void deleteUser(User user) {
        bank.remove(user);
    }



    /**
     * Метод реализует добавление нового счета пользователю.
     *
     * @param account  Новый счет, который нужно добавить.
     * @param passport Паспортные данные клиента, которому нужно добавить счет.
     */
    public void addAccountToUser(String passport, Account account) {
        bank.get(getUser(passport)).add(account);
    }

    /**
     * Метод реализует удаление счета пользователя.
     *
     * @param account  Счет, который нужно удалить.
     * @param passport Паспортные данные клиента, которому нужно удалить счет.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        bank.get(getUser(passport)).remove(account);
    }

    /**
     * Метод реализует получение всех счетов пользователя по паспортным данным.
     *
     * @param passport Паспортные данные клиента, счета которого нужно получить.
     * @return Возвращает лист счетов клиента
     */
    public List<Account> getUserAccounts(String passport) {
        return bank.get(this.getUser(passport));
    }

    /**
     * Метод реализует получение пользователя по паспортным данным.
     *
     * @param passport Паспортные данные клиента.
     * @return Возвращает найденногог клиента.
     */
    public User getUser(String passport) {
        User result = new User();
        for (Map.Entry<User, List<Account>> entry : bank.entrySet()) {
            User user = entry.getKey();
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

}
