package repository.impl;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.domain.Member;
import repository.ItemRspository;

import java.util.HashMap;
import java.util.Optional;

public class HashMapItemRepository implements ItemRspository {
    private static final HashMapItemRepository instance = new HashMapItemRepository();
    HashMap<Integer, Item> map = new HashMap<>();

    @Override
    public Optional<Item> addItem(Item item) {
        return Optional.ofNullable(map.put(item.getId(),item));
    }

    @Override
    public void deleteItem(int id) {
        System.out.println("삭제할 ID "+map.get(id));
        map.remove(id);
        System.out.println("삭제완료");
    }

    @Override
    public void findItem(String name) {
        map.get(name);
    }
}
