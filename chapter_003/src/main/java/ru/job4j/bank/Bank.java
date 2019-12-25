package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Банковские переводы.
 * @author Slevkelebr
 * @version 1.0
 * @since 25.12.2019
 */
public class Bank {
    private Map<User, List<Account>> users = new HashMap<>();

    public Map<User, List<Account>> getUsers() {
        return users;
    }

    /**
     * Добавляет пользователя.
     * @param user новый пользователь.
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавляем новый счет пользователю.
     * @param passport идентификатор пользователя.
     * @param account новый счет.
     */
    public void addAccountToUser(String passport, Account account) {
        User requiredUser = findUser(passport);
        if (requiredUser != null) {
            this.users.get(requiredUser).add(account);
        }
    }

    /**
     * Находит пользователя по паспортую
     * @param passport идентификатор пользователя.
     * @return user пользователь.
     */
    public User findUser(String passport) {
        User result = null;
        for (Map.Entry<User, List<Account>> user : this.users.entrySet()) {
          if (user.getKey().getPassport().equals(passport)) {
              result = user.getKey();
              break;
          }
      }
        return result;
    }

    /**
     * Удаляет пользователя.
     * @param user пользователь.
     */
    public void deleteUser(User user) {
        this.users.remove(user);
    }

    /**
     * Удаляет счёт у пользователя.
     * @param passport идентификатор пользователя.
     * @param account счет пользователя.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        User requiredUser = findUser(passport);
        if (requiredUser != null) {
            this.users.get(requiredUser).remove(account);
        }
    }

    /**
     * Получить список счетов для пользователя.
     * @param passport идентфикатор пользователя.
     * @return список счетов пользователя.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> accaunts = new ArrayList<>();
        User requiredUser = findUser(passport);
        if (requiredUser != null) {
            accaunts = this.users.get(requiredUser);
        }
        return accaunts;
    }

    /**
     * Возвращает действистельный счет.
     * @param passport идитефикатор пользователя.
     * @param requisite идитефикатор счета.
     * @return возвращает счет
     */
    public Account getActualAccount(String passport, String requisite) {
        List<Account> list = getUserAccounts(passport);
        Account result = null;
        for (Account account: list) {
            if (account.getRequisites().contains(requisite)) {
                result = account;
                break;
            }
        }
        return result;
    }

    /**
     * Перевод денег с одного счета на другой.
     * @param srcPassport иденфикатор пользователя отправителя.
     * @param srcRequisite счет откуда осуществляется перевод.
     * @param destPassport иденфикатор пользователя получателя.
     * @param dstRequisite счет куда приходит пополнение.
     * @param amount сумма перевода.
     * @return true если операция прошла успешна, false если счет не найден или не хватет денег на счете.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean result;
        Account first = getActualAccount(srcPassport, srcRequisite);
        Account second = getActualAccount(destPassport, dstRequisite);
        if (first == null || second == null) {
            result = false;
        }
        result = first.transfer(second, amount);
        return result;
    }
}