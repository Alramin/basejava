package ru.javawebinar.webapp.storage.collection;


import ru.javawebinar.webapp.model.Resume;
import ru.javawebinar.webapp.storage.AbstractStorage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListStorage extends AbstractStorage {

    private  List<Resume> list = new ArrayList<>();

    protected  int getIndex(String uuid)
    {
        for (int i =0; i<list.size(); i++)
        {
            if(list.get(i).getUuid().equals(uuid))
            {
                return  i;
            }
        }
        return  -1;
    }

    @Override
    protected boolean exist(String uuid) {
        return getIndex(uuid)>=0;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    protected void doClear() {
       list.clear();
    }

    @Override
    public void save(Resume r) {
        super.save(r);
    }

    @Override
    protected void doSave(Resume r) {
        list.add(r);

    }

    @Override
    public void update(Resume r) {
        super.update(r);
    }

    @Override
    protected void doUpdate(Resume r) {
     list.set(getIndex(r.getUuid()), r);
    }


    @Override
    protected Resume doLoad(String uuid) {
        return list.get(getIndex(uuid));
    }

    @Override
    public void delete(String uuid) {
       list.remove(getIndex(uuid));
    }

    @Override
    protected void doDelete(String uuid) {

    }


    @Override
    protected List<Resume> doGetAll() {
        return new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }
}
