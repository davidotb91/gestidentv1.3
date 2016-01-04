/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejb;

import com.ec.entity.Doctor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author david
 */
@Local
public interface DoctorFacadeLocal {

    void create(Doctor doctor);

    void edit(Doctor doctor);

    void remove(Doctor doctor);

    Doctor find(Object id);

    List<Doctor> findAll();

    List<Doctor> findRange(int[] range);

    int count();
    
}
