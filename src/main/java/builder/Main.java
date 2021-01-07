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

        Director director = new Director();

        Builder planStandardBuilder = new PlanStandardBuilder();
        Plan plan = director.constructStandardPlan(planStandardBuilder);

        System.out.println(plan.getPlanType());





    }
}
