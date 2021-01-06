package builder;

import org.junit.jupiter.api.Test;
import plan.DailyPlan;
import plan.MealPlan;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    ArrayList<WeekPlan> weekPlans = new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan()));
    ArrayList<DailyPlan> dailyPlans = new ArrayList<>(Arrays.asList(new DailyPlan()));
    ArrayList<MealPlan> mealPlans = new ArrayList<>(Arrays.asList(new MealPlan()));
    PlanType planType = PlanType.PREMIUM;

    @Test
    void createPremiumPlan(){

        PlanBuilder planBuilder = new PlanBuilder();
        planBuilder.setMealPlan(mealPlans);
        planBuilder.setDailyPlan(dailyPlans);
        planBuilder.setWeekPlan(weekPlans);
        planBuilder.setPlanType(PlanType.PREMIUM);

        Plan plan = planBuilder.getResult();

        assertTrue(plan instanceof Plan);
    }
    @Test
    void comparePlan(){

        Plan expectedPlan = new Plan(weekPlans,dailyPlans,mealPlans,planType);

        PlanBuilder planBuilder = new PlanBuilder();
        planBuilder.setPlanType(planType);

        Plan plan = planBuilder.getResult();

        assertEquals(expectedPlan.getPlanType(),plan.getPlanType());

    }

    @Test
    void valueNotSet(){
        PlanBuilder planBuilder = new PlanBuilder();

        Plan plan = planBuilder.getResult();

        assertEquals(plan.getMealPlans(),null);
    }

    @Test
    void instanceTest(){
        PlanBuilder planBuilder = new PlanBuilder();

        Plan plan = planBuilder.getResult();

        assertEquals(plan.getClass(),Plan.class);
    }

}