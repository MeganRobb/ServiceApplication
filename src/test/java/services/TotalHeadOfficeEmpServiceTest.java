/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.megan.shoecoweb.app.config.ConnectionConfig;
import com.megan.shoecoweb.domain.admin.HeadOfficeEmployees;
import com.megan.shoecoweb.repository.HeadofficeEpmloyeesRepository;
import com.megan.shoecoweb.services.TotalHeadOfficeEmpServices;
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
public class TotalHeadOfficeEmpServiceTest {
     public static ApplicationContext ctx;
     private TotalHeadOfficeEmpServices hoeService;
        private HeadofficeEpmloyeesRepository hoRepo;
    public TotalHeadOfficeEmpServiceTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void total() {
        hoeService = ctx.getBean(TotalHeadOfficeEmpServices.class);
        List<HeadOfficeEmployees> hoe = hoeService.getTotalHeadOfficeEmp();
        
        Assert.assertEquals(hoe.size(),0,"Expected head officeEmployees");
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
        hoRepo = ctx.getBean(HeadofficeEpmloyeesRepository.class);
        hoRepo.deleteAll();
    }
}
