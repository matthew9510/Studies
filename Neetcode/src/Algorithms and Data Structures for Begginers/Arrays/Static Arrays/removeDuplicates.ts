// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Attempt 1
// export function removeDuplicates(
//   arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
// ): number  {
// let leftPointer = 0;
// let rightPointer = 0;
// if (arr.length > 1) {
//   while (true) {
//     rightPointer++
//     if (arr[leftPointer] !== arr[rightPointer]) {
//       rightPointer++;
//     } else {
//       leftPointer++;
//     }
//   }
// } else {
//   return 0;
// }
// }

// Attempt 2
// export function removeDuplicates(
//   arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
// ): number  {
// let leftPointer = 1;
// let rightPointer = 1;

// attempt two
// while(rightPointer < arr.length){
//   if(leftPointer === rightPointer){
//     rightPointer++;
//     continue;
//   }
//   if(arr[leftPointer] < arr[rightPointer]){
//     arr[leftPointer] = arr[rightPointer];
//     leftPointer++;
//     continue;
//   }
//   if(arr[leftPointer] === arr[rightPointer]){
//     rightPointer++;
//   }
// }
// return leftPointer;
// }

// Attempt 3
// export function removeDuplicates(
//   arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
// ): number  {
// while (rightPointer < arr.length) {
//   if (leftPointer === rightPointer) {
//     rightPointer++;
//     continue;
//   }
//   if (arr[leftPointer - 1] < arr[rightPointer]) {
//     arr[leftPointer] = arr[rightPointer];
//     leftPointer++;
//     continue;
//   }
//   if (arr[leftPointer] === arr[rightPointer]) {
//     rightPointer++;
//   }
// }

// Attempt 4
// export function removeDuplicates(
//   arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
// ): number  {
// let leftPointer = 1;
// let rightPointer = 1;
// while (rightPointer < arr.length) {
//   // if (leftPointer === rightPointer) {
//   //   rightPointer++;
//   //   continue;
//   // }
//   if (arr[leftPointer - 1] < arr[rightPointer]) {
//     arr[leftPointer] = arr[rightPointer];
//     leftPointer++;
//     continue;
//   }
//   // if (arr[leftPointer] === arr[rightPointer]) {
//   //   rightPointer++;
//   // }
//   rightPointer++;
// }

// Attempt 5
// why do you start pointers at 1?
//   b/c I look back at arr[leftpointer-1] but do the updating at arr[leftPointer].
//   You can also start leftPointer at 0 and right pointer at 1 and then alter the conditional to 'if(arr[leftPointer] < arr[rightPointer]) {' in encompassment with the actual updating via 'arr[leftPointer+1] = arr[rightPointer]', but then lastly you'd have to 'return leftPointer + 1'
// export function removeDuplicates(
//   arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
// ): number  {
//   if (arr.length < 2) {
//     throw new Error(
//       "remove duplicates requires an array with at least 2 values"
//     );
//   }

//   let leftPointer = 0;
//   let rightPointer = 1;

//   while (rightPointer < arr.length) {
//     if (arr[leftPointer] < arr[rightPointer]) {
//       arr[leftPointer + 1] = arr[rightPointer];
//       leftPointer++;
//       continue;
//     }
//     rightPointer++;
//   }

//   return leftPointer + 1;
// }

// Final Solution
export function removeDuplicates(
  arr: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4]
): number {
  if (arr.length < 2) {
    throw new Error(
      "remove duplicates requires an array with at least 2 values"
    );
  }

  let leftPointer = 1;

  for (let rightPointer = 1; rightPointer < arr.length; rightPointer++) {
    if (arr[rightPointer] !== arr[rightPointer - 1]) {
      arr[leftPointer] = arr[rightPointer];
      leftPointer++;
    }
  }

  return leftPointer;
}

// removeDuplicates();
