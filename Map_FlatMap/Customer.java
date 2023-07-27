package Map_FlatMap;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }
    public String getName() {
        return name;
    }
    public Customer(int id, String name, String email, List<String> phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getPhone() {
        return phone;
    }
    public void setPhone(List<String> phone) {
        this.phone = phone;
    }


    
}
