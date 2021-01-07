package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.List;

public interface Builder {
    void setPlanType();
    void setWeekPlan(List<WeekPlan> weekPlan);
    void setDailyPlan(List<DailyPlan>dailyPlan);
    void setMealPlan(List<MealPlan>mealPlans);
    Plan build();
}
