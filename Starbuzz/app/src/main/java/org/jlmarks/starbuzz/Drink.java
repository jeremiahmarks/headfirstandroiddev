package org.jlmarks.starbuzz;

/**
 * Created by Jeremiah on 3/27/2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "espresso and steamed milk", R.drawable.latte),
            new Drink("Cappy", "espresso, hot and steamed milk", R.drawable.cappuccino),
            new Drink("Filter", "Beans, bro", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
