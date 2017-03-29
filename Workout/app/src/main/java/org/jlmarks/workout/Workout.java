package org.jlmarks.workout;

/**
 * Created by Jeremiah on 3/28/2017.
 */

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Limb Loosener", "5 HS PU \n10 1 legged squats\n15 pull ups"),
            new Workout("Core Agony", "100 Pull ups\n100 Push up\n100 Sit ups\n 100 Squats"),
            new Workout("The wimp special", "cheeseburger\nfries\nshake"),
            new Workout("Strength and Length", "Run\nRun Some More\n????\nProfit")
    };
    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
