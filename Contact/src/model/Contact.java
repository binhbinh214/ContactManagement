package model;

public class Contact {

    private int id;
    private String fullName;
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String fullName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "|" + id + "|" + fullName + "|" + getFirstName() + "|" + getLastName()
                + "|" + group + "|" + address + "|" + phone + "|";
    }

    public String getFirstName() {
        String[] parts = fullName.split(" ");
        if (parts.length >= 2) {
            return parts[0];
        }
        return "";
    }

    public String getLastName() {
        String[] parts = fullName.split(" ");
        if (parts.length >= 2) {
            return parts[1];
        }
        return "";
    }
}
