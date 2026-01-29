public class MembershipRepository implements CrudRepository<BaseEntity> {
    @Override
    public void create(BaseEntity entity) { /* JDBC Logic */ }
    @Override
    public BaseEntity read(int id) { return null; }
    @Override
    public List<BaseEntity> readAll() { return null; }
    @Override
    public void update(BaseEntity entity) { /* JDBC Logic */ }
    @Override
    public void delete(int id) { /* JDBC Logic */ }
}