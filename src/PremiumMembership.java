public class PremiumMembership extends BaseEntity {
    private boolean personalTrainerIncluded;

    public boolean isPersonalTrainerIncluded() { return personalTrainerIncluded; }
    public void setPersonalTrainerIncluded(boolean personalTrainerIncluded) {
        this.personalTrainerIncluded = personalTrainerIncluded;
    }

    @Override
    public double calculateMonthlyFee() {
        return 100.0;
    }

    @Override
    public String getMembershipDetails() {
        return "Premium Membership with Trainer: " + personalTrainerIncluded;
    }
}