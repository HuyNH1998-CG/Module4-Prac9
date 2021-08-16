package Model;

public class Employee {
    private String id;
    private String name;
    private String contactNum;

    public Employee() {
    }

    public Employee(String id, String name, String contactNum) {
        this.id = id;
        this.name = name;
        this.contactNum = contactNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
}
