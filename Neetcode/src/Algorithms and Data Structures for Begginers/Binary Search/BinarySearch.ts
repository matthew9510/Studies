function binarySearch(arr: number[], target: number): number {
    var l = 0
    var r = arr.length - 1;

    while (l <= r) {
        let mid = Math.floor((l+r) / 2);

        if (target < arr[mid]) {
            r = mid - 1
        } else if (target > arr[mid]) {
            l = mid + 1
        } else {
            return mid
        }
    }
    return -1;
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8]
let index = binarySearch(arr, 6)
console.log(index)