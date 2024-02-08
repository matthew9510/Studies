function intersection(array1, array2) {
    var searchTerm = array1.length < array2.length ? array1 : array2;
    var iterableToScan = array1.length < array2.length ? array2 : array1;
    // Attempt 1 getting more familiar with loops
    //   for (let elem of iterableToScan) {}
    //   iterableToScan.forEach((elem: T) => {});
    //   for (let i = 0; i < iterableToScan.length; i++) {
    //     if (iterableToScan[i] === searchTerm[i]) {
    //       for (let j = 0; j < searchTerm.length; j++) {}
    //     }
    //   }
    var iterableIdx = 0;
    var searchTermIdx = 0;
    var iterableIdxBeforeShimmy = 0;
    // loop to keep searching for searchterm in iterable
    while (iterableIdx < iterableToScan.length) {
        // can end early if length of iterable is smaller than search term
        var numOfElementsLeftExclusive = iterableToScan.length - iterableIdx; // double check this runs correctly with shrinking numbers; // 3 -1 NUMBER OF ELEMENTS LEFT don't subract 1; calculating an index you subtract ones; but NOTE YOUR INDEX STARTS AT 0; // double check -1 logic;
        var searchConstraintFailed = numOfElementsLeftExclusive < searchTerm.length;
        if (searchConstraintFailed) {
            return -1;
        }
        if (iterableToScan[iterableIdx] === searchTerm[searchTermIdx]) {
            iterableIdxBeforeShimmy = iterableIdx;
            //   searchTermIdx = 0; // like how cleanup was before rather than after while // NM CAN"T DO NOT after IF CONDITION DEPENDENT ON value above
            while (iterableIdx < iterableToScan.length &&
                searchTermIdx < searchTerm.length) {
                // did we find the whole search term?  // problem statement we are finding first index
                if (iterableToScan[iterableIdx] === searchTerm[searchTermIdx]) {
                    if (searchTermIdx === searchTerm.length - 1)
                        return iterableIdxBeforeShimmy;
                    else {
                        iterableIdx++;
                        searchTermIdx++;
                    }
                }
                else {
                    searchTermIdx = 0; // actually it'd be before while and we have to do it before search termIDX is used in outerloop // like how cleanup was before rather than after while
                    break;
                }
            }
            // if we haven't found the intersection or intersections reset iterableIdx at appropriate location based on numOfShimmies performed in attempt to find intersection idx
            var numOfShimmies = iterableIdx - iterableIdxBeforeShimmy;
            iterableIdx = iterableIdxBeforeShimmy + 1 + numOfShimmies;
        }
        else {
            iterableIdx++;
        }
        // optimization later -> decrease the search term by 1 element from left to right
    }
    return -1;
}
// intersection([1, 2, 3], [2, 3]); // 1;
// intersection([1, 2, 3], [2, 4, 5]); // -1;
// intersection([1, 2, ÷3, 2, 4, 5], [2, 4]); // 3;
intersection([1, 2, 3, 2, 4, 5], [2, 5]); // -1;
