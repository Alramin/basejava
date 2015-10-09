package resume.ru.cv.model;

import resume.ru.cv.model.util.Contact;

import java.util.Map;
import java.util.Set;

public class Employe {

    private String fullName;
    private String location;
   // private Set<String> links;
    private Map<Contact, String> contacts;

    public Employe(String fullName, String location, Map<Contact, String> contacts) {
        this.fullName = fullName;
        this.location = location;
        this.contacts = contacts;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public void setLinks(Set<String> links) {
//        this.links = links;
//    }

    public void setContacts(Map<Contact, String> contacts) {
        this.contacts = contacts;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

//    public Set<String> getLinks() {
//        return links;
//    }

    public Map<Contact, String> getContacts() {
        return contacts;
    }


}
