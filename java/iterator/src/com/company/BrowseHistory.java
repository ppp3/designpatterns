package com.company;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private String[] urls=new String[10];
    private int count;

    public Iterator createIterator()
    {
        return  new ArrayIterator(this);
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public void push (String url)
    {
       urls[count]=url;
       count++;
    }

    public String pop()
    {
        return(urls[--count]);
    }

    public class ArrayIterator implements Iterator
    {
        private BrowseHistory history;
        private int index;
        public ArrayIterator(BrowseHistory history)
        {
            this.history=history;
        }

        @Override
        public boolean hasNext() {
            return (index<history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
                index++;
        }
    }
}
