package resume.ru.cv;

import resume.ru.cv.entitys.util.Contact;

import java.util.Map;
import java.util.Set;

public class Employee {

    private String fullName;
    private String location;
    private Set<String> links;
    private Map<Contact, String> contacts;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLinks(Set<String> links) {
        this.links = links;
    }

    public void setContacts(Map<Contact, String> contacts) {
        this.contacts = contacts;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public Set<String> getLinks() {
        return links;
    }

    public Map<Contact, String> getContacts() {
        return contacts;
    }
}
