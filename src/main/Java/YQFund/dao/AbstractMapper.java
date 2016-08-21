package YQFund.dao;

/**
 * @author gwt
 * @param <T>
 */
public interface AbstractMapper<T> {

    Integer add(T t);

    Integer delete(long id);

    T get(long id);

    Integer update(T t);

    Integer deleteAll();
    
}
