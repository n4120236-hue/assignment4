public class MembershipService {
    private final CrudRepository<BaseEntity> repository;

    public MembershipService(CrudRepository<BaseEntity> repository) {
        this.repository = repository;
    }

    public void addMembership(BaseEntity membership) {
        if (membership.getName() == null) throw new RuntimeException("Invalid Input");
        repository.create(membership);
    }
}