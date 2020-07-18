public class MealBuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost : "+vegMeal.getPrice());

        Meal nonVegMeal = mealBuilder.prepareChickenMeal();
        nonVegMeal.showItems();

        System.out.println("Total cost : "+nonVegMeal.getPrice());
    }


}
