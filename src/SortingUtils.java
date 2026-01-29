import java.util.List;

public class SortingUtils {
    public static void sortMembershipsByName(List<BaseEntity> list) {
        list.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
    }
}