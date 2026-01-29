import java.util.Scanner;

public class MembershipController {
    private final MembershipServiceImpl service;
    private final Scanner scanner = new Scanner(System.in);

    public MembershipController(MembershipServiceImpl service) {
        this.service = service;
    }

    public void start() {
        System.out.println("1. Add Membership\n2. View All\n3. Run Reflection");
        int choice = scanner.nextInt();
        if (choice == 1) {
            handleCreate();
        }
    }

    private void handleCreate() {
        try {
            PremiumMembership pm = new PremiumMembership();
            pm.setName("John Doe");
            service.registerMembership(pm);
            System.out.println("Success!");
        } catch (InvalidInputException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}