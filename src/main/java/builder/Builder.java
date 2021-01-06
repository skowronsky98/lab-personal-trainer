package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.List;

public interface Builder {
    void setPlanType(PlanType planType);
    void setWeekPlan(List<WeekPlan> weekPlan);
    void setDailyPlan(List<DailyPlan>dailyPlan);
    void setMealPlan(List<MealPlan>mealPlans);
}
