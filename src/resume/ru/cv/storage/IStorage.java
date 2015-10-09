package resume.ru.cv.storage;


import resume.ru.cv.Resume;

import java.util.Collection;

public interface IStorage {

    void save(Resume r);

    void update(Resume r);

    Resume get(String uuid);

    void delete(String uuid);

    Collection<Resume> getAll();

    int size();

    void clear();
}
