public class BasicMembership extends BaseEntity {
    @Override
    public double calculateMonthlyFee() {
        return 50.0;
    }

    @Override
    public String getMembershipDetails() {
        return "Standard Basic Membership access";
    }
}