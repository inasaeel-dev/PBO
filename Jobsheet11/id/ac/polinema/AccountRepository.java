package Jobsheet11.id.ac.polinema;

import java.util.Collection;

public interface AccountRepository {
  void save(Account acount);
  Account findByNumber (String accountNumber);
  Collection<Account> findAll();
}
