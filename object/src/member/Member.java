package member;

public class Member {
    private String id;
    private String name;
    private String addr;
    private String email;

    public Member() {
    }

    public Member(String id, String name, String addr, String email) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.email = email;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", addr=" + addr + ", email=" + email + "]";
    }

}
