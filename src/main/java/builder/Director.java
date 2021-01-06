package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {
    public void constructStandardPlan(Builder builder){
        builder.setPlanType(PlanType.STANDARD);
        builder.setMealPlan(new ArrayList<>(Arrays.asList(new MealPlan())));
        builder.setDailyPlan(new ArrayList<>(Arrays.asList(new DailyPlan())));
        builder.setWeekPlan(new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan())));
    }

    public void constructPremiumPlan(Builder builder){
        builder.setPlanType(PlanType.PREMIUM);
        builder.setMealPlan(new ArrayList<>(Arrays.asList(new MealPlan())));
        builder.setDailyPlan(new ArrayList<>(Arrays.asList(new DailyPlan())));
        builder.setWeekPlan(new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan(), new WeekPlan())));
    }
}
