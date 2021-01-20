package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void createStandardPlan(){

        Director director = new Director();

        Builder planStandardBuilder = new PlanStandardBuilder();
        Plan plan = director.constructStandardPlan(planStandardBuilder);

        assertEquals(PlanType.STANDARD,plan.getPlanType());
    }
    @Test
    void createPremiumPlan(){

        Director director = new Director();

        Builder planStandardBuilder = new PlanStandardBuilder();
        Plan standardPlan = director.constructStandardPlan(planStandardBuilder);

        Builder planPremiumBuilder = new PlanPremiumBuilder();
        Plan premiumPlan = director.constructPremiumPlan(planPremiumBuilder);


        assertNotEquals(standardPlan.getPlanType(),premiumPlan.getPlanType());
    }

    @Test
    void instancePremiumPlan(){

        Director director = new Director();

        Builder planPremiumBuilder = new PlanPremiumBuilder();
        Plan premiumPlan = director.constructPremiumPlan(planPremiumBuilder);

        assertTrue(premiumPlan instanceof Plan);

    }

}