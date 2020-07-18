public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
}
