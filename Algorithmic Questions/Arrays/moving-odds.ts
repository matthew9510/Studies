function moveOdds(arr: number[]): number[] {
  /*
      Summary:
      This function moves all zeros in the array to the end while maintaining the order of the other elements.
      It works by creating a pointer (zeroIndex) that keeps track of the position where the next non-zero element should be placed.
      As we iterate through the array, if the current element is not zero, we place it at the position indicated by zeroIndex.
      If zeroIndex is not the same as the current index, it means we've encountered a zero before and we need to replace the current position with zero.
      After each non-zero element is placed, we increment zeroIndex.
      The function then returns the modified array.
    */

  let currEvenIdx = 0;

  arr.forEach((value, idx) => {
    if (value % 2 === 0) {
      let tempValueBeforeSwap = arr[currEvenIdx];
      arr[currEvenIdx] = value;

      if (idx !== currEvenIdx) {
        arr[idx] = tempValueBeforeSwap;
      }
      currEvenIdx++;
    }
  });

  return arr;
}

const evensAndOdds = [1, 0, 3, 0, 0, 6, 7];
const movedOdds: number[] = moveOdds(evensAndOdds);
console.log(evensAndOdds);
