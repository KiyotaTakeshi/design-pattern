package com.kiyotakeshi.Prototype2;

import com.kiyotakeshi.Prototype2.prototype.Item;
import com.kiyotakeshi.Prototype2.prototype.Manager;
import com.kiyotakeshi.Prototype2.prototype.sub.Potion;
import com.kiyotakeshi.Prototype2.prototype.sub.Sword;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Potion redPotion = new Potion("red potion");
        manager.register("redPotion", redPotion);

        Potion blackPotion = new Potion("black potion");
        manager.register("blackPotion", blackPotion);

        Sword bronzeSword = new Sword("bronze sword");
        manager.register("bronzeSword", bronzeSword);

        Item potion1 = manager.create("redPotion");
        potion1.get();
        potion1.use();

        Item potion2 = manager.create("blackPotion");
        potion2.get();
        potion2.use();

        Item sword = manager.create("bronzeSword");
        sword.get();
        sword.use();
    }
}
