import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenteeTest {

    @Test
    void userFactoryCreateMentee(){
        Mentee mentee = null;
        try {
            mentee = (Mentee) UserFactory.manufactureUser(UserType.MENTEE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(mentee instanceof Mentee);

    }

    @Test
    void userFactoryCreateTrainerNotEqualsMentee(){
        Trainer trainer = null;
        try {
            trainer = (Trainer) UserFactory.manufactureUser(UserType.TRAINER);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotEquals(Mentee.class,trainer.getClass());

    }
}