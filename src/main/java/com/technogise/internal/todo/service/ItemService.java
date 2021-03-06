package com.technogise.internal.todo.service;

import com.technogise.internal.todo.model.Item;
import com.technogise.internal.todo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService
{
    @Autowired
    private ItemRepository itemRepository;

    public Item add(String description) {
        Item item = new Item(description);
        return itemRepository.save(item);
    }
}
