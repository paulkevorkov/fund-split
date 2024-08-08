package fundsplit.dao;

import fundsplit.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser, String> {
    
    AppUser findAppUserByName(String name);

}
