package repository;

import itc.hoseo.pos.domain.Item;

import java.util.Optional;

public interface ItemRspository {
    public Optional<Item> addItem(Item item);
    public void deleteItem(int id);
    public void findItem(String name);
}
