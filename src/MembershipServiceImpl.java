public class MembershipServiceImpl implements Validatable<BaseEntity> {
    private final CrudRepository<BaseEntity> repository;

    public MembershipServiceImpl(CrudRepository<BaseEntity> repository) {
        this.repository = repository;
    }

    public void registerMembership(BaseEntity member) throws InvalidInputException {
        if (!validate(member)) {
            throw new InvalidInputException("Invalid membership data");
        }
        repository.create(member);
    }

    @Override
    public boolean validate(BaseEntity entity) {
        return entity.getName() != null && entity.getName().length() > 2;
    }
}