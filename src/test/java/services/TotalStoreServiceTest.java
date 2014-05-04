/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.megan.shoecoweb.app.config.ConnectionConfig;
import com.megan.shoecoweb.domain.admin.Stores;
import com.megan.shoecoweb.repository.StoreRepository;
import com.megan.shoecoweb.services.TotalStoreService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Megan
 */
public class TotalStoreServiceTest {
    
   public static ApplicationContext ctx;
     private TotalStoreService sService;
        private StoreRepository sRepo;
    public TotalStoreServiceTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void total() {
        sService = ctx.getBean(TotalStoreService.class);
        List<Stores> soe = sService.getTotalStoreService();
        
        Assert.assertEquals(soe.size(),0,"Expected Stores");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        sRepo = ctx.getBean(StoreRepository.class);
        sRepo.deleteAll();
    }
}
