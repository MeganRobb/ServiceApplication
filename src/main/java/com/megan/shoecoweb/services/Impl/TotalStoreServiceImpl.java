/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.shoecoweb.services.Impl;

import com.megan.shoecoweb.domain.admin.Stores;
import com.megan.shoecoweb.repository.StoreRepository;
import com.megan.shoecoweb.services.TotalStoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Megan
 */
@Service
public class TotalStoreServiceImpl implements TotalStoreService {
 @Autowired
 private StoreRepository stRep;
 
 @Override
 public List<Stores> getTotalStoreService(){
     return stRep.findAll();
 }
 }

