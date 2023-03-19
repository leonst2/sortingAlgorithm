def quickSort(sequence):
    length = len(sequence)
    if length <= 1:
        return sequence
    else:
        pivot = sequence.pop()
    itemGreater = []
    itemLower = []
    for item in sequence:
        if item > pivot:
            itemGreater.append(item)
        else:
            itemLower.append(item)
    return quickSort(itemLower) + [pivot] + quickSort(itemGreater)


print(quickSort([3, 4, 7, 2, 5, 3, 11, 34, 2, 0, 8, 12, 25]))
