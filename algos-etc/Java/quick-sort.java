List<T> quickSort(List<T> list, int start, int end) {
  int wall = start;
  int pivot = end;
  if (start < end) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < pivot) {
        T tmp = list.get(i);
        list.set(i, list.get(wall));
        list.set(wall, tmp);
        wall++;
      }
    }
    list = quickSort(list, start, wall - 1);
    list = quickSort(list, wall, end);
  }
  return list;
}
