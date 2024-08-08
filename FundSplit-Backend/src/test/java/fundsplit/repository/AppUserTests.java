package fundsplit.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fundsplit.dao.AppUserRepository;
import fundsplit.model.AppUser;

@SpringBootTest
public class AppUserTests {
    
    @Autowired
    private AppUserRepository appUserRepository;

    @BeforeEach
    @AfterEach
    public void clearDatabase(){
        appUserRepository.deleteAll();
    }

    @Test
    public void testPersistAndLoadAppUser(){
        //create app user
        String name = "Joe";
        String phoneNb = "450-225-8484";
        String password = "12345";
        AppUser appUser = new AppUser(name, phoneNb, password);

        // save app user
        appUserRepository.save(appUser);
        
        // read app user from database
        AppUser appUserFromDB = appUserRepository.findAppUserByName(name);

        //assertions
        assertNotNull(appUserFromDB);

        assertEquals(appUser.getId(), appUserFromDB.getId());
        assertEquals(name, appUserFromDB.getName());
        assertEquals(phoneNb, appUserFromDB.getPhoneNb());
        assertEquals(password, appUserFromDB.getPassword());

    }
}
