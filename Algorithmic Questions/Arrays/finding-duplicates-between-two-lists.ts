function findingDuplicatesBetweenTwoLists<T>(arr1: T[], arr2: T[]): T[] {
  // Ensure we are removing duplicates in each list
  const set1 = new Set(arr1);
  const set2 = new Set(arr2);

  return [...set1].filter((value) => set2.has(value));
}

const array1 = [1, 2, 3, 4, 5];
const array2 = [1, 3, 5, 7];
const duplicates = findingDuplicatesBetweenTwoLists(array1, array2);
console.log(duplicates);
