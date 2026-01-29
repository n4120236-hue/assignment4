public abstract class BaseEntity {
    private int id;
    private String name;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public abstract double calculateMonthlyFee();
    public abstract String getMembershipDetails();

    public String getBasicInfo() {
        return "ID: " + id + ", Name: " + name;
    }
}