package impl;

import inter.Generator;

/**
 *
 * 利用范型——工厂模式
 * Created by laojiaqi on 16/9/4.
 */
public class BasicGenerator<T> implements Generator<T>{

    Class<T> tClass;
    public BasicGenerator(Class<T> tClass){
        this.tClass=tClass;
    }

    public T next() {
        T instance=null;
        try {
            instance=tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public  static <T> Generator<T> getGenerator(Class<T> inputClass){
        return  new BasicGenerator<T>(inputClass);
    }


}
