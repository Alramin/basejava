package resume.ru.cv.storage;

import java.util.Arrays;
import java.util.Collection;

import resume.ru.cv.storage.exception.StorageException;

import resume.ru.cv.model.Resume;

public class ArrayStorage implements IStorage {

    public static final String NOT_FOUND = "Resume not found in storage";
    public static final String ALREADY_EXISTS = "Resume is already exist in storage";
    public static final String MAX_VOLUME_EXCEEDED = "Max storage volume is exceeded";
    private static final int MAX_ARRAY_LENGTH = 10000;

    private Resume[] array = new Resume[MAX_ARRAY_LENGTH];

    int currentNumber = 0;

    @Override
    public void save(Resume r) {
        for (int i = 0; i < currentNumber; i++) {
            if (array[i].getUuid().equals(r.getUuid())) {
                throw new StorageException(ALREADY_EXISTS);
            }
        }
        if(array.length!= currentNumber)
            array[currentNumber++] = r;
        else
            throw new StorageException(MAX_VOLUME_EXCEEDED);
    }

    @Override
    public void update(Resume r) {
        for (int i = 0; i < currentNumber; i++) {
            if(array[i].getUuid().equals(r.getUuid())){
                array[i] = r;
                break;
            }
        }
        throw new StorageException(NOT_FOUND);
    }

    @Override
    public Resume get(String uuid) {
        for (int i = 0; i < currentNumber; i++) {
            if (array[i].getUuid().equals(uuid)) {
                return array[i];
            }
        }
        throw new StorageException(NOT_FOUND);
    }

    @Override
    public void delete(String uuid) {
        int index = MAX_ARRAY_LENGTH;
        for (int i = 0; i < currentNumber; i++)
            if(array[i].getUuid().equals(uuid))
                index = i;

        int numMoved = MAX_ARRAY_LENGTH - index - 1;
        if (numMoved > 0){
            System.arraycopy(array, index+1, array, index,
                    numMoved);
            currentNumber--;
        }
        else throw new StorageException(NOT_FOUND);
    }


    @Override
    public Collection<Resume> getAll() {
        Resume[] shortArray = new Resume[currentNumber];
        System.arraycopy(array, 0, shortArray, 0, currentNumber);
        return Arrays.asList(shortArray);
    }

    @Override
    public int size() {
        return currentNumber;
    }

    @Override
    public void clear() {
        array = new Resume[MAX_ARRAY_LENGTH];
    }
}