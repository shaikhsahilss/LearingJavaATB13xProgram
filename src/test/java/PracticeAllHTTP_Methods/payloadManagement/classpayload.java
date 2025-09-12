package PracticeAllHTTP_Methods.payloadManagement;

import java.util.List;

public class classpayload {
    private String name;
    private String study;
    private List<Subjects> subjectsList;

    public void setSubjectsList(List<Subjects> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }


}
