package com.midway.ocp8.lambda.functionalInterface.builtIn.predicate;

@FunctionalInterface
interface TriPredicate<T, U, V> {
	boolean test(T t, U u, V v);
}
