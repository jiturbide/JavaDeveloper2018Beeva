package com.curso.extra.functions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestBuiltIn06Func {

    public static void main(String[] args) {
        
        UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMIPLE

        Predicate ex4 = String::isEmpty; // DOES NOT COMPILE
        
        Function<List<String>, String> ex1 = x -> x.get(0); // DOES NOT COMPILE
    }
}


/*
public interface ToDoubleFunction<T> {
  public double applyAsDouble(T t);
}

public interface DoubleFunction<R> {
  public R apply(double value);
}

public interface BiPredicate<T, U> {
    public boolean test(T t, U u);
}

public interface UnaryOperator<T> extends Function<T,T> {
  public T apply(T t);
}
*/