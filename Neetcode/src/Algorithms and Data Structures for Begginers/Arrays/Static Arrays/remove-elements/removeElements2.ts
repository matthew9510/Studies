// function removeElement2(nums: number[], val: number): number {
// var numOfVals = 0;
// todo implement count of vals seen and reduce for loop condition
// for (let i = 0; i < nums.length; i++) {
//     if (nums[i] === val) {
//         for (var j = i; j < nums.length - 1; j++) {
//             // precondition
//             if(nums[j+1] === val){
//                 let nextNonValIndex = j+2        ; // jump over to the the next index
//                 while(nums[nextNonValIndex] === val){
//                     nextNonValIndex++
//                 }
//                 nums[j] = nums[nextNonValIndex];
//                 nums[nextNonValIndex] = val;
//                 j = nextNonValIndex-3;
//             }
//             else{
//                 nums[j] = nums[j + 1];
//                 nums[j + 1] = val;
//             }

//         }
//     }
// }
// return nums.indexOf(val) || nums.length;
// }

function removeElement2(nums: number[], val: number) {
    var leftPointer = 0;
    var rightPointer = nums.length - 1;
    // var swapCounter = 0;

    if(nums.length === 0){
        return 0;
    }
    if(nums.length===1){
        if(nums[0] === val){
            return 0;
        }
        return 1;
    }

    while (leftPointer < rightPointer) {
        if (nums[leftPointer] !== val) {
            leftPointer++;

        } else {
            if (nums[rightPointer] === val) {
                rightPointer--;
                continue;
            }
            nums[leftPointer] = nums[rightPointer];
            nums[rightPointer] = val;
            // swapCounter++;
            rightPointer--;
            leftPointer++;
        }
    }

    if(rightPointer === 0 && leftPointer === 0){
        return 0;
    }

    // return nums[nums.length -1 -swapCounter] === val ? nums.length - swapCounter -1 : nums.length - swapCounter;
    return nums.indexOf(val) > -1?  nums.indexOf(val) : nums.length;
}

// console.log([0, 1, 2, 2, 3, 0, 4, 2].length);
// console.log(removeElement2([0, 1, 2, 2, 3, 0, 4, 2], 2));
// console.log(removeElement2([3,3], 3));
// console.log(removeElement2([2,3,3], 3));
// console.log(removeElement2([3,3], 5));



