package ru.job4j.bank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void addUser() {
        Bank bank = new Bank();
        User user = new User("Petr", "AB0202");
        bank.addUser(user);
        User expectedUser = new User("Petr", "AB0202");
        User actualUser = bank.findUser("AB0202");
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void addAccountToUser() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0201");
        bank.addUser(user);
        bank.addAccountToUser("AB0201", new Account(100.5, "VTB"));
        Account actualAccount = bank.getActualAccount("AB0201", "VTB");
        Account expectedAccount = new Account(100.5, "VTB");
        assertEquals(expectedAccount, actualAccount);
    }

    @Test
    public void findUser() {
        Bank bank = new Bank();
        User actualUser = new User("Ivan", "AB0301");
        bank.addUser(actualUser);
        User expectedUser = bank.findUser("AB0301");
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void deleteUser() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0201");
        bank.addUser(user);
        bank.deleteUser(user);
        User actualUser = bank.findUser("AB0201");
        assertNull(actualUser);
    }

    @Test
    public void deleteAccountFromUser() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0620");
        bank.addUser(user);
        bank.addAccountToUser("AB0620", new Account(1123.5, "VTB"));
        bank.addAccountToUser("AB0620", new Account(555.5, "Tinkoff"));
        Account delAccount = new Account(100.5, "SBER");
        bank.addAccountToUser("AB0620", delAccount);
        bank.deleteAccountFromUser("AB0620", delAccount);
        List<Account> actualAccount = bank.getUserAccounts("AB0620");
        List<Account> expectedAccount = new ArrayList<>();
        expectedAccount.add(new Account(1123.5, "VTB"));
        expectedAccount.add(new Account(555.5, "Tinkoff"));
        Assert.assertArrayEquals(expectedAccount.toArray(), actualAccount.toArray());
    }

    @Test
    public void getActualAccount() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0620");
        bank.addUser(user);
        bank.addAccountToUser("AB0620", new Account(1123.5, "VTB"));
        Account account = new Account(555.5, "Tinkoff");
        bank.addAccountToUser("AB0620", account);
        Account expectedAccount = bank.getActualAccount("AB0620", "Tinkoff");
        assertEquals(expectedAccount, account);
    }

    @Test
    public void transferMoneyTrue() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0620");
        bank.addUser(user);
        bank.addAccountToUser("AB0620", new Account(1123.5, "VTB"));
        bank.addAccountToUser("AB0620", new Account(555.5, "Tinkoff"));
        boolean expected = bank.transferMoney("AB0620", "VTB", "AB0620", "Tinkoff", 444.5);
        assertTrue(expected);
    }

    @Test
    public void transferMoneyFalse() {
        Bank bank = new Bank();
        User user = new User("Sergey", "AB0620");
        bank.addUser(user);
        bank.addAccountToUser("AB0620", new Account(1123.5, "VTB"));
        bank.addAccountToUser("AB0620", new Account(555.5, "Tinkoff"));
        boolean expected = bank.transferMoney("AB0620", "VTB", "AB0620", "SBER", 444.5);
        assertFalse(expected);
    }
}