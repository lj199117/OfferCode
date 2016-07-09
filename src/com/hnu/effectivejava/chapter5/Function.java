// Generic Function interface - Page 122
package com.hnu.effectivejava.chapter5;

interface Function<T> {
    T apply(T arg1, T arg2);
}
