package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.List;

public class Plan {
    private List<WeekPlan> weekPlans;
    private List<DailyPlan> dailyPlans;
    private List<MealPlan> mealPlans;
    private PlanType planType;

    public Plan() {
    }

    public Plan(List<WeekPlan> weekPlans, List<DailyPlan> dailyPlans, List<MealPlan> mealPlans, PlanType planType) {
        this.weekPlans = weekPlans;
        this.dailyPlans = dailyPlans;
        this.mealPlans = mealPlans;
        this.planType = planType;
    }



    public List<WeekPlan> getWeekPlans() {
        return weekPlans;
    }

    public void setWeekPlans(List<WeekPlan> weekPlans) {
        this.weekPlans = weekPlans;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public List<DailyPlan> getDailyPlans() {
        return dailyPlans;
    }

    public void setDailyPlans(List<DailyPlan> dailyPlans) {
        this.dailyPlans = dailyPlans;
    }

    public List<MealPlan> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<MealPlan> mealPlans) {
        this.mealPlans = mealPlans;
    }
}
