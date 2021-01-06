package staticfactory;

public class UserFactory {

    public static User manufactureUser(UserType type) throws Exception {
        if(type.equals(UserType.MENTEE))
            return new Mentee();
        if(type.equals(UserType.TRAINER))
            return new Trainer();
        else throw new Exception();
    }
}
