/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.shoecoweb.services.Impl;

import com.megan.shoecoweb.domain.admin.HeadOfficeEmployees;
import com.megan.shoecoweb.repository.HeadofficeEpmloyeesRepository;
import com.megan.shoecoweb.services.TotalHeadOfficeEmpServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Megan
 */
@Service
public class TotalHeadOfficeEmpServiceImpl implements TotalHeadOfficeEmpServices{
   @Autowired
   private HeadofficeEpmloyeesRepository hoeRep; 
   
   @Override
   public List <HeadOfficeEmployees> getTotalHeadOfficeEmp(){
       return hoeRep.findAll();
   }
   }

