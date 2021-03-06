/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.god.androidmore.datastructure;

/**
 * 线性表的接口
 */
public interface List<T> extends Collection<T> {

  boolean isEmpty();

  boolean add(T t);

  void clear();

  boolean equals(Object o);

  boolean remove(Object o);

  boolean remove();

  T get(int index);

  T set(int index, T t);

  int indexOf(Object o);
}
