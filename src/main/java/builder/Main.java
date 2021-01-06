package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<WeekPlan> weekPlans = new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan()));
        ArrayList<DailyPlan> dailyPlans = new ArrayList<>(Arrays.asList(new DailyPlan()));
        ArrayList<MealPlan> mealPlans = new ArrayList<>(Arrays.asList(new MealPlan()));

        PlanBuilder planBuilder = new PlanBuilder();
        planBuilder.setMealPlan(mealPlans);
        planBuilder.setDailyPlan(dailyPlans);
        planBuilder.setWeekPlan(weekPlans);
        planBuilder.setPlanType(PlanType.PREMIUM);

        Plan plan = planBuilder.getResult();

        System.out.println(plan.getPlanType());
    }
}
