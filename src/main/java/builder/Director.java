package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {
    public Plan constructStandardPlan(Builder builder){
        builder.setPlanType();
        builder.setMealPlan(new ArrayList<>(Arrays.asList(new MealPlan())));
        builder.setDailyPlan(new ArrayList<>(Arrays.asList(new DailyPlan())));
        builder.setWeekPlan(new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan())));
        return builder.build();
    }

    public Plan constructPremiumPlan(Builder builder){
        builder.setPlanType();
        builder.setMealPlan(new ArrayList<>(Arrays.asList(new MealPlan())));
        builder.setDailyPlan(new ArrayList<>(Arrays.asList(new DailyPlan())));
        builder.setWeekPlan(new ArrayList<>(Arrays.asList(new WeekPlan(),new WeekPlan(), new WeekPlan())));
        return builder.build();
    }
}
