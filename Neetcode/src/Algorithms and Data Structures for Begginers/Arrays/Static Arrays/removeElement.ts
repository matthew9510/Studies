// 27. Remove Element
// Easy
// 4.9K
// 6.6K
// Companies
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int val = ...; // Value to remove
// int[] expectedNums = [...]; // The expected answer with correct length.
//                             // It is sorted with no values equaling val.

// int k = removeElement(nums, val); // Calls your implementation

// assert k == expectedNums.length;
// sort(nums, 0, k); // Sort the first k elements of nums
// for (int i = 0; i < actualLength; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

 

// Example 1:
// [3, 2, 3, 2, 3]
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
// Note that the five elements can be returned in any order.
// It does not matter what you leave beyond the returned k (hence they are underscores).
 

// Constraints:

// 0 <= nums.length <= 100
// 0 <= nums[i] <= 50
// 0 <= val <= 100
// Accepted
// 1.6M
// Submissions
// 3M
// Acceptance Rate
// 52.3%

function removeElement(nums: number[], val: number): number | void{
    // Psuedo code
    // start with left index at 0 see if it equals val
    // if so look for next element to override that value 
        // then increment the pointer of left index 
    // if the value is not equal to val shift both left and possibly right pointer 
    
    let leftIndex: number = 0
    let rightIndex: number = 1

    while(rightIndex < nums.length){
        if(nums[leftIndex] === val){
            if(nums[rightIndex] === val || rightIndex===leftIndex){
                rightIndex++ //
                // continue; // if its taken away then can we guarentee that right index is < nums.length
            }
            const valueToSwap = nums[leftIndex]
            nums[leftIndex] = nums[rightIndex]
            nums[rightIndex] = valueToSwap
            leftIndex++;
            rightIndex++;
        }
        else{
            leftIndex++;
        }
    }
    return leftIndex;
};

console.log(removeElement([3,2,3,2,4,3,5],3) === 4)
