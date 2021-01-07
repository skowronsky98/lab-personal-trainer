package builder;

import plan.DailyPlan;
import plan.MealPlan;

import java.util.List;

public class PlanStandardBuilder implements Builder{
    private List<WeekPlan> weekPlans;
    private List<DailyPlan> dailyPlans;
    private List<MealPlan> mealPlans;
    private PlanType planType;

    Plan plan = new Plan();

    public PlanStandardBuilder() {
    }

    @Override
    public void setPlanType() {
        this.planType = PlanType.STANDARD;
    }

    @Override
    public void setWeekPlan(List<WeekPlan> weekPlan) {
        this.weekPlans = weekPlan;
    }

    @Override
    public void setDailyPlan(List<DailyPlan> dailyPlan) {
        this.dailyPlans = dailyPlan;
    }

    @Override
    public void setMealPlan(List<MealPlan> mealPlans) {
        this.mealPlans = mealPlans;
    }

    @Override
    public Plan build(){
        return new Plan(weekPlans,dailyPlans,mealPlans,planType);
    }
}
