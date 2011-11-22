//implementation of quicksort method in groovy
def quickSort(list) {
    if(list.size() < 2) return list
    def pivot = list[list.size().intdiv(2)]
    def left = list.findAll{item -> item < pivot}
    def middle = list.findAll{item -> item == pivot}
    def right = list.findAll{item -> item > pivot}
    return (quickSort(left) + middle + quickSort(right))
}
assert quickSort([]) == []
assert quickSort([1]) == [1]
assert quickSort([1,2]) == [1,2]
assert quickSort([2,1]) == [1,2]
assert quickSort([2,1,3]) == [1,2,3]