/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.service;

import com.smart.model.Subject;
import com.smart.model.SubjectDetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface CFIDBServiceLocal {

    List<Subject> GetValidSubjects();

    List<SubjectDetail> GetSubjectDetails(Subject subject);
    
}
