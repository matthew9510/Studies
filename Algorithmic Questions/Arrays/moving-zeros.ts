function moveZeros(arr: number[]): number[] {
  /*
    Summary:
    This function moves all zeros in the array to the end while maintaining the order of the other elements.
    It works by creating a pointer (zeroIndex) that keeps track of the position where the next non-zero element should be placed.
    As we iterate through the array, if the current element is not zero, we place it at the position indicated by zeroIndex.
    If zeroIndex is not the same as the current index, it means we've encountered a zero before and we need to replace the current position with zero.
    After each non-zero element is placed, we increment zeroIndex.
    The function then returns the modified array.
  */
  let zeroIndex = 0;
  arr.forEach((value, index) => {
    if (value !== 0) {
      arr[zeroIndex] = value;
      if (zeroIndex !== index) {
        arr[index] = 0;
      }
      zeroIndex++;
    }
  });
  return arr;
}

const zeros = [1, 0, 3, 0, 0, 6, 7];
const movedZeros: number[] = moveZeros(zeros);
console.log(movedZeros);

const noZeros = [1, 2, 3, 4];
const noZerosresult = moveZeros(noZeros);
console.log(noZerosresult);

function moveZeroesDraftAttempt(arr: number[]): number[] {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) {
      let j = i + 1;
      while (j < arr.length) {
        if (arr[j] === 0) {
          j++;
          continue;
        }
        arr[i] = arr[j];
        arr[j] = 0;
        break;
      }
      // Return early if no more elements in array other than zero
      if (j === arr.length - 1) {
        return arr;
      }
    }
  }
  return arr;
}
