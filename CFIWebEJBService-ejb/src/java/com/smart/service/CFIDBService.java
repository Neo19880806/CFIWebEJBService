/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.service;


import com.smart.entities.Tblcrnsessions;
import com.smart.entities.TblcrnsessionsPK;
import com.smart.entities.TblsiscrnsSr0042018S2;
import com.smart.entities.Tblstaffdetails;
import com.smart.entities.Tblsubjectcompetencies;
import com.smart.entities.TblsubjectcompetenciesPK;
import com.smart.model.Subject;
import com.smart.model.SubjectDetail;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Administrator
 */
@Stateless
public class CFIDBService implements CFIDBServiceLocal {

    @PersistenceContext(unitName = "CFIWebEJBService-ejbPU")
    private EntityManager em;


    public EntityManager getEm() {
        return em;
    }

    @Override
    public List<Subject> GetValidSubjects() {
        List<Subject> subjectList = new ArrayList<>();
        Query query = getEm().createNativeQuery("Select DISTINCT `Course Title` from tblSISCRNs_SR004_2018_S2");
        List<String> list = query.getResultList();
        for (String s : list) {
            Subject subject = new Subject();
            subject.setName(s);
            subjectList.add(subject);
        }
        return subjectList;
    }

    @Override
    public List<SubjectDetail> GetSubjectDetails(Subject subject) {
        String queryString = String.format("Select * from tblSISCRNs_SR004_2018_S2 where `Course Title` = \"" + subject.getName()+"\"");
        Query query = getEm().createNativeQuery(queryString,TblsiscrnsSr0042018S2.class);
        List<TblsiscrnsSr0042018S2> list = query.getResultList();
        List<SubjectDetail> details = new ArrayList<>();
        for (TblsiscrnsSr0042018S2 tblSISCRNsSR0042018S2:list){
                String crn = tblSISCRNsSR0042018S2.getCrn();
                String courseTitle = tblSISCRNsSR0042018S2.getCourseTitle();
                String startDate = tblSISCRNsSR0042018S2.getMeetingStartDate();
                String finishDate = tblSISCRNsSR0042018S2.getMeetingFinishDate();
                String room = tblSISCRNsSR0042018S2.getRoom();
                String lecturerId = tblSISCRNsSR0042018S2.getLecturerID();
                String campus = tblSISCRNsSR0042018S2.getCampus();
                String courseCode = tblSISCRNsSR0042018S2.getCourseCode();

                String time = null;
                String dayOfWeek = null;
                Query CRNSessionsQuery = getEm().createNativeQuery("select * from tblCRNSessions where crn=\"" + crn + "\""
                ,Tblcrnsessions.class);
                List<Tblcrnsessions> tblCRNSessionsList = CRNSessionsQuery.getResultList();
                if (tblCRNSessionsList.size() == 1) {
                    Tblcrnsessions tblCRNSessions = tblCRNSessionsList.get(0);
                    TblcrnsessionsPK tblCRNSessionsPK = tblCRNSessions.getTblcrnsessionsPK();
                    time = tblCRNSessionsPK.getTime();
                    dayOfWeek = tblCRNSessionsPK.getDayofWeek();
                } else {
                    continue;
                }
                String itSubject = null;
                Query queryCompetencies = getEm().createNativeQuery("select * from tblSubjectCompetencies where CourseNumber=\"" + courseCode + "\"",
                        Tblsubjectcompetencies.class);
                List<Tblsubjectcompetencies> competenciesList = queryCompetencies.getResultList();
                if (competenciesList.size() == 1) {
                    Tblsubjectcompetencies tblSubjectCompetencies = competenciesList.get(0);
                    TblsubjectcompetenciesPK tblSubjectCompetenciesPK = tblSubjectCompetencies.getTblsubjectcompetenciesPK();
                    itSubject = tblSubjectCompetenciesPK.getITSubject();
                } else {
                    continue;
                }

                String lecturer = null;
                Query queryStaffDetails = getEm().createNativeQuery("select * from tblStaffDetails where InstructorID=\"" + lecturerId + "\"",
                        Tblstaffdetails.class);
                List<Tblstaffdetails> staffDetailsList = queryStaffDetails.getResultList();
                if (staffDetailsList.size() == 1) {
                    Tblstaffdetails tblStaffDetails = staffDetailsList.get(0);
                    lecturer = tblStaffDetails.getUniqueName();
                } else {
                    continue;
                }

                if (room != null && dayOfWeek != null) {
                    SubjectDetail detail = new SubjectDetail();
                    detail.setCRN(crn);
                    detail.setSubjectCode(itSubject);
                    detail.setCompetencyName(courseTitle);
                    detail.setCampus(campus);
                    detail.setDayOfWeek(dayOfWeek);
                    detail.setLecturer(lecturer);
                    detail.setStartDate(startDate);
                    detail.setTime(time);
                    detail.setEndDate(finishDate);
                    detail.setRoom(room);
                    details.add(detail);
                }
        }

        return details;
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
