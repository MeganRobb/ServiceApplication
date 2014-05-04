/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.shoecoweb.services.Impl;

import com.megan.shoecoweb.domain.admin.StoreEmployees;
import com.megan.shoecoweb.repository.StoreEmployeesRepository;
import com.megan.shoecoweb.services.TotalStoreEmpService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Megan
 */
@Service
public class TotalStoreEmpServiceImpl implements TotalStoreEmpService{
   @Autowired
   private StoreEmployeesRepository sRep; 
   
   @Override
   public List <StoreEmployees> getTotalStoreEmp(){
       return sRep.findAll();
   }
}
