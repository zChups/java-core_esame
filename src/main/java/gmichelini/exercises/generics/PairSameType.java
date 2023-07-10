package gmichelini.exercises.generics;

public class PairSameType<T> extends Pair<T,T>{
    T first;
    T second;
    public PairSameType(T first, T second) {
        super(first, second);
    }

    public void swap(){
        T tmp = getFirst();
        setFirst(getSecond());
        setSecond(tmp);
    }

}

