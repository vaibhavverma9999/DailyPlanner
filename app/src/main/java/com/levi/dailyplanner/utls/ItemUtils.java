package com.levi.dailyplanner.utls;

import com.levi.dailyplanner.model.Item;
import com.levi.dailyplanner.model.Priority;

import java.util.ArrayList;
import java.util.List;

public class ItemUtils {
    public List<Item> getData() {
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item("First Item", "first description", Priority.HIGH, null, null, false);
        Item item2 = new Item("Second Item", "first description", Priority.HIGH, null, null, false);
        Item item3 = new Item("Third Item", "first description", Priority.HIGH, null, null, false);
        Item item4 = new Item("Fourth Item", "first description", Priority.HIGH, null, null, false);
        Item item5 = new Item("Second Item", "first description", Priority.HIGH, null, null, false);
        Item item6 = new Item("Third Item", "first description", Priority.HIGH, null, null, false);
        Item item7 = new Item("Fourth Item", "first description", Priority.HIGH, null, null, false);
        Item item8 = new Item("Second Item", "first description", Priority.HIGH, null, null, false);
        Item item9 = new Item("Third Item", "first description", Priority.HIGH, null, null, false);
        Item item10 = new Item("Fourth Item", "first description", Priority.HIGH, null, null, false);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);

        return itemList;
    }
}
