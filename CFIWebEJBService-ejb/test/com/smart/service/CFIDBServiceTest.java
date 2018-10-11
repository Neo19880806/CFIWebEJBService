/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.service;

import com.smart.model.Subject;
import com.smart.model.SubjectDetail;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CFIDBServiceTest {
    
    public CFIDBServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetValidSubjects method, of class CFIDBService.
     */
    @Test
    public void testGetValidSubjects() throws Exception {
        System.out.println("GetValidSubjects");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CFIDBServiceLocal instance = (CFIDBServiceLocal)container.getContext().lookup("java:global/classes/CFIDBService");
        List<Subject> expResult = null;
        List<Subject> result = instance.GetValidSubjects();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetSubjectDetails method, of class CFIDBService.
     */
    @Test
    public void testGetSubjectDetails() throws Exception {
        System.out.println("GetSubjectDetails");
        Subject subject = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CFIDBServiceLocal instance = (CFIDBServiceLocal)container.getContext().lookup("java:global/classes/CFIDBService");
        List<SubjectDetail> expResult = null;
        List<SubjectDetail> result = instance.GetSubjectDetails(subject);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
