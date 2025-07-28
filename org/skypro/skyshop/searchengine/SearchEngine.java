package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.searchable.Searchable;

public class SearchEngine {
    private final Searchable[] searchableItems;
    private int count = 0;


    public SearchEngine(int size) {
        searchableItems = new Searchable[size];
    }


    public void add(Searchable searchable) {
        if (count < searchableItems.length) {
            searchableItems[count++] = searchable;
        }
    }

    public Searchable[] search(String term) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.searchTerm().contains(term)) {
                if (resultCount < 5) {
                    results[resultCount++] = item;
                } else {
                    break;
                }
            }
        }
        return results;
    }
}
