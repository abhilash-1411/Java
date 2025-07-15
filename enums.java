enum Status {
    FAILED,
    SUCCESS,
    PENDING,
    APPROVED,
    REJECTED
}


public class enums {
    public static void main(String args[]){
    Status s=Status.SUCCESS;
    System.out.println("Status: " + s);
    System.out.println("Status ordinal: " + s.ordinal());
    System.out.println("Status name: " + s.name());

    Status[] statuses = Status.values();
    System.out.println("All statuses:");
    for (Status status : statuses) {
        System.out.println(" - " + status+ " (ordinal: " + status.ordinal() + ")");
    }

    }
}
