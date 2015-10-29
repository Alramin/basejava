package ru.javawebinar.webapp.storage.collection;


import ru.javawebinar.webapp.model.Resume;
import ru.javawebinar.webapp.storage.AbstractStorage;


import java.util.*;

public class MapStorage extends AbstractStorage {

    private Map<String, Resume> map = new HashMap<>();



    @Override
    protected void doSave(Resume r) {
        map.put(r.getUuid(), r);
    }

    @Override
    protected void doUpdate(Resume r) {
        map.put(r.getUuid(), r);
    }

    @Override
    protected void doDelete(String uuid) {
        map.remove(uuid);
    }

    @Override
    protected List<Resume> doGetAll() {
        return null;
    }

    @Override
    protected Resume doLoad(String uuid) {
        return map.get(uuid);
    }

    @Override
    protected void doClear() {

    }

    @Override
    protected boolean exist(String uuid) {
        return map.containsKey(uuid);
    }

    @Override
    public int size() {
        return map.size();
    }
}
