public class Main {
    public static void main(String[] args) {

        try {
            Mentee mentee = (Mentee) UserFactory.manufactureUser(UserType.MENTEE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
