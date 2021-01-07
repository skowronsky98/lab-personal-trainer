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

//    @Test
//    void createPremiumPlan(){
//
//        PlanStandardBuilder planStandardBuilder = new PlanStandardBuilder();
//        planStandardBuilder.setMealPlan(mealPlans);
//        planStandardBuilder.setDailyPlan(dailyPlans);
//        planStandardBuilder.setWeekPlan(weekPlans);
//        planStandardBuilder.setPlanType();
//
//        Plan plan = planStandardBuilder.build();
//
//        assertTrue(plan instanceof PlanStandardBuilder);
//    }
//    @Test
//    void comparePlan(){
//
//        Plan expectedPlan = new Plan(weekPlans,dailyPlans,mealPlans,planType);
//
//        PlanStandardBuilder planStandardBuilder = new PlanStandardBuilder();
//        planStandardBuilder.setPlanType();
//
//        Plan plan = planStandardBuilder.build();
//
//        assertEquals(expectedPlan.getPlanType(),plan.getPlanType());
//
//    }
//
//    @Test
//    void valueNotSet(){
//        PlanStandardBuilder planStandardBuilder = new PlanStandardBuilder();
//
//        Plan plan = planStandardBuilder.build();
//
//        assertEquals(plan.getMealPlans(),null);
//    }
//
//    @Test
//    void instanceTest(){
//        PlanStandardBuilder planStandardBuilder = new PlanStandardBuilder();
//
//        Plan plan = planStandardBuilder.build();
//
//        assertEquals(plan.getClass(),Plan.class);
//    }

}