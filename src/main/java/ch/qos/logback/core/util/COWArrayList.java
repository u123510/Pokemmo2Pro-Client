package ch.qos.logback.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class COWArrayList implements List {
   AtomicBoolean fresh;
   CopyOnWriteArrayList underlyingList;
   Object[] ourCopy;
   final Object[] modelArray;

   public COWArrayList(Object[] var1) {



      super();
      AtomicBoolean var2;
      var2 = new AtomicBoolean(false);
      this.fresh = var2;
      CopyOnWriteArrayList var3;
      var3 = new CopyOnWriteArrayList();
      this.underlyingList = var3;
      this.modelArray = var1;
   }

   private void refreshCopyIfNecessary() {
      if (!this.isFresh()) {
         this.refreshCopy();
      }

   }

   private boolean isFresh() {
      return this.fresh.get();
   }

   private void refreshCopy() {
      this.ourCopy = this.underlyingList.toArray(this.modelArray);
      this.fresh.set(true);
   }

   private void markAsStale() {
      this.fresh.set(false);
   }

   public int size() {
      return this.underlyingList.size();
   }

   public boolean isEmpty() {
      return this.underlyingList.isEmpty();
   }

   public boolean contains(Object var1) {
      return this.underlyingList.contains(var1);
   }

   public Iterator iterator() {
      return this.underlyingList.iterator();
   }

   public Object[] toArray() {
      this.refreshCopyIfNecessary();
      return this.ourCopy;
   }

   public Object[] toArray(Object[] var1) {
      this.refreshCopyIfNecessary();
      return this.ourCopy;
   }

   public Object[] asTypedArray() {
      this.refreshCopyIfNecessary();
      return this.ourCopy;
   }

   public void addIfAbsent(Object var1) {
      this.underlyingList.addIfAbsent(var1);
      this.markAsStale();
   }

   public boolean add(Object var1) {
      boolean var10000 = this.underlyingList.add(var1);
      this.markAsStale();
      return var10000;
   }

   public boolean remove(Object var1) {
      boolean var10000 = this.underlyingList.remove(var1);
      this.markAsStale();
      return var10000;
   }

   public boolean containsAll(Collection var1) {
      return this.underlyingList.containsAll(var1);
   }

   public boolean addAll(Collection var1) {
      this.markAsStale();
      return this.underlyingList.addAll(var1);
   }

   public boolean addAll(int var1, Collection var2) {
      this.markAsStale();
      return this.underlyingList.addAll(var1, var2);
   }

   public boolean removeAll(Collection var1) {
      this.markAsStale();
      return this.underlyingList.removeAll(var1);
   }

   public boolean retainAll(Collection var1) {
      this.markAsStale();
      return this.underlyingList.retainAll(var1);
   }

   public void clear() {
      this.markAsStale();
      this.underlyingList.clear();
   }

   public Object get(int var1) {
      this.refreshCopyIfNecessary();
      return this.ourCopy[var1];
   }

   public Object set(int var1, Object var2) {
      this.markAsStale();
      return this.underlyingList.set(var1, var2);
   }

   public void add(int var1, Object var2) {
      this.markAsStale();
      this.underlyingList.add(var1, var2);
   }

   public Object remove(int var1) {
      this.markAsStale();
      return this.underlyingList.remove(var1);
   }

   public int indexOf(Object var1) {
      return this.underlyingList.indexOf(var1);
   }

   public int lastIndexOf(Object var1) {
      return this.underlyingList.lastIndexOf(var1);
   }

   public ListIterator listIterator() {
      return this.underlyingList.listIterator();
   }

   public ListIterator listIterator(int var1) {
      return this.underlyingList.listIterator(var1);
   }

   public List subList(int var1, int var2) {
      return this.underlyingList.subList(var1, var2);
   }
}
