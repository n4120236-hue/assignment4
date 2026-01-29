public interface Validatable<T> {
    boolean validate(T entity);

    default void printStatus(boolean isValid) {
        System.out.println("Validation status: " + (isValid ? "PASSED" : "FAILED"));
    }

    static boolean isNotNull(Object obj) {
        return obj != null;
    }
}